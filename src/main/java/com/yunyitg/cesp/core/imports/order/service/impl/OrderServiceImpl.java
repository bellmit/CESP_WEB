package com.yunyitg.cesp.core.imports.order.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.SSLEngineResult.Status;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunyitg.cesp.common.dto.BaseResult;
import com.yunyitg.cesp.common.enums.StatusEnum;
import com.yunyitg.cesp.common.statics.MessageType;
import com.yunyitg.cesp.common.utils.DateFormatUtil;
import com.yunyitg.cesp.common.utils.JAXBUtil;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.common.utils.MessageIDCreater;
import com.yunyitg.cesp.core.company.service.impl.CompanyManager;
import com.yunyitg.cesp.core.imports.message.dao.SendMessageMapper;
import com.yunyitg.cesp.core.imports.message.entity.SendMessage;
import com.yunyitg.cesp.core.imports.order.dao.OrderDetailMapper;
import com.yunyitg.cesp.core.imports.order.dao.OrderGoodsListMapper;
import com.yunyitg.cesp.core.imports.order.dao.OrderHeadMapper;
import com.yunyitg.cesp.core.imports.order.dto.OrderDetailPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.order.dto.OrderGoodsListPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.order.dto.OrderHeadPoiEntityOfMode;
import com.yunyitg.cesp.core.imports.order.dto.OrderHeadQueryDto;
import com.yunyitg.cesp.core.imports.order.dto.OrderDetailQueryDto;
import com.yunyitg.cesp.core.imports.order.entity.OrderDetail;
import com.yunyitg.cesp.core.imports.order.entity.OrderGoodsList;
import com.yunyitg.cesp.core.imports.order.entity.OrderHead;
import com.yunyitg.cesp.core.imports.order.enums.InvoiceTypeEnum;
import com.yunyitg.cesp.core.imports.order.enums.OrderDocTypeEnum;
import com.yunyitg.cesp.core.imports.order.enums.OrderStatusEnum;
import com.yunyitg.cesp.core.imports.order.enums.PayStatusEnum;
import com.yunyitg.cesp.core.imports.order.event.KJ881111MessageCreateEvent;
import com.yunyitg.cesp.core.imports.order.event.SendEmailEvent;
import com.yunyitg.cesp.core.imports.order.event.SendMessageEvent;
import com.yunyitg.cesp.core.imports.order.service.OrderService;
import com.yunyitg.cesp.core.imports.order.validation.OrderImportResult;
import com.yunyitg.cesp.core.imports.order.validation.handler.OrderDetailExcelVerifyHandler;
import com.yunyitg.cesp.core.imports.order.validation.handler.OrderGoodsListExcelVerifyHandler;
import com.yunyitg.cesp.core.imports.order.validation.handler.OrderHeadExcelVerifyHandler;
import com.yunyitg.cesp.core.imports.order.vo.OrderContentVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderDetailListVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderDetailVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderGoodsListVo;
import com.yunyitg.cesp.core.imports.order.vo.OrderHeadListVo;
import com.yunyitg.cesp.core.imports.order.xml.obj.InternationalTrade;
import com.yunyitg.cesp.system.base.service.impl.BaseInfoManager;
import com.yunyitg.cesp.system.shiro.token.manager.TokenManager;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDetailMapper orderDetailMapper;
	
	@Autowired
	private OrderHeadMapper orderHeadMapper;
	
	@Autowired
	private OrderGoodsListMapper orderGoodsListMapper;
	
	@Autowired
	private CompanyManager companyManager;
	
	@Autowired
	private BaseInfoManager baseInfoManager;
	
	@Autowired
	private SendMessageMapper sendMessageMapper;

	@Autowired
	private ApplicationContext applicationContext;
	
	
	@Override
	public PageInfo<OrderHeadListVo> listOrderHeadByConditions(OrderHeadQueryDto queryDto) {
		Integer pageNum = queryDto.getPageNum()==null ? 1 : queryDto.getPageNum();
		Integer pageSize = queryDto.getPageSize()==null ? 10 : queryDto.getPageSize();
		Example example = createOrderHeadExample(queryDto);
		PageHelper.startPage(pageNum, pageSize);
		List<OrderHead> orderHeadList = orderHeadMapper.selectByExample(example);
		List<OrderHeadListVo> orderHeadListVos = decorateOrderHeads(orderHeadList);
		
		return new PageInfo<OrderHeadListVo>(orderHeadListVos);
	}
	
	private List<OrderHeadListVo> decorateOrderHeads(List<OrderHead> orderHeadList) {
		List<OrderHeadListVo> vos = new ArrayList<OrderHeadListVo>();
		for (OrderHead orderHead : orderHeadList) {
			vos.add(decorateOrderHead(orderHead));
		}
		return vos;
	}
	
	private OrderHeadListVo decorateOrderHead(OrderHead orderHead) {
		OrderHeadListVo vo = new OrderHeadListVo();
		BeanUtils.copyProperties(orderHead, vo);
		vo.setDeclStatusDesc(StatusEnum.DescOf(orderHead.getDeclStatus()));
		vo.setDeclEntName(companyManager.getNameById(orderHead.getDeclEntId()));
		vo.setEbEntName(companyManager.getNameById(orderHead.getEbEntId()));
		vo.setCustomsName(baseInfoManager.getCustomsNameByCode(orderHead.getCustomsCode()));
		vo.setCiqOrgName(baseInfoManager.getCiqOrgNameByCode(orderHead.getCiqOrgCode()));
		
		return vo;
	}
	
	private Example createOrderHeadExample(OrderHeadQueryDto queryDto) {
		Example example = new Example(OrderHead.class);
		//设置查询列
		example.selectProperties("id","createAt","declTime","declStatus","messageId","declMode",
				"declEntId","ebEntId","functionCode","customsCode","ciqOrgCode");
		Criteria cri = example.createCriteria();
		// 申报企业ID
//		Integer declEntId = TokenManager.getCompanyId();
		Integer declEntId = companyManager.getCompanyIdByGzeportCode(queryDto.getDeclEntNo());
		if (null != declEntId) {
			cri.andEqualTo("declEntId", declEntId);
		}
		// 电商企业ID
		Integer ebEntId = companyManager.getCompanyIdByGzeportCode(queryDto.getEbEntNo());
		if (null != ebEntId) {
			cri.andEqualTo("ebEntId", ebEntId);
		}
		// 入库时间起
		if (queryDto.getStartAt() != null) {
			cri.andGreaterThan("createAt", queryDto.getStartAt());
		}
		//入库时间末
		if (queryDto.getEndAt() != null) {
			cri.andLessThan("createAt", queryDto.getEndAt());
		}
		//申报时间起
		if (queryDto.getDeclTimeFrom() != null) {
			cri.andGreaterThan("declTime", queryDto.getDeclTimeFrom());
		}
		//申报时间末
		if (queryDto.getDeclTimeTo() != null) {
			cri.andLessThan("declTime", queryDto.getDeclTimeTo());
		}
		// 申报状态 集合
		if (StringUtils.isNotBlank(queryDto.getDeclStatus())) { 
			String[] declStatusArray = queryDto.getDeclStatus().split(","); 
			cri.andIn("declStatus", Arrays.asList(declStatusArray));
		}
		// 报送方式 集合
		if (StringUtils.isNotBlank(queryDto.getDeclMode())) {
			String[] declModeArray = queryDto.getDeclMode().split(",");
			cri.andIn("declMode", Arrays.asList(declModeArray));
		}
		//业务类型
		if (StringUtils.isNotBlank(queryDto.getFunctionCode())) {
			String[] functionCodeArray = queryDto.getFunctionCode().split(",");
			cri.andIn("functionCode", Arrays.asList(functionCodeArray));
		}
		// 主管海关代码
		if (StringUtils.isNotBlank(queryDto.getCustomsCode())) {
			cri.andEqualTo("customsCode", queryDto.getCustomsCode());
		}
		// 检验检疫机构
		if (StringUtils.isNotBlank(queryDto.getCiqOrgCode())) {
			cri.andEqualTo("ciqOrgCode", queryDto.getCiqOrgCode());
		}
		
		example.orderBy("id").desc();
		return example;
	}

	@Override
	public OrderDetail findOrderDetailById(Integer orderDetailId) {
		
		OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(orderDetailId);
//		if (orderDetail != null && (TokenManager.getCompanyId() == orderDetail.getEbEntId() || 
//				TokenManager.getCompanyId() == orderDetail.getDeclEntId())) {
//			
//			List<OrderGoodsList> orderGoodsLists = orderGoodsListMapper.findByOrderDetailId(orderDetailId);
//			return orderDetail;
//		}
		List<OrderGoodsList> orderGoodsLists = findOrderGoodsListByOrderDetailId(orderDetailId);
		orderDetail.setGoodsList(orderGoodsLists);
		return orderDetail;
	}
	
	
	private List<OrderGoodsList> findOrderGoodsListByOrderDetailId(Integer orderDetailId) {
		Assert.notNull(orderDetailId,"orderDetailId must not be null");
		
		List<OrderGoodsList> orderGoodsLists = orderGoodsListMapper.findByOrderDetailId(orderDetailId);
		return orderGoodsLists;
	}
	
	@Override
	public OrderContentVo findOrderContentVoById(Integer id) {
		
		OrderDetail orderDetail = findOrderDetailById(id);
		OrderDetailVo orderDetailVo = decorateOrderDetail(orderDetail);
		
		OrderContentVo orderContentVo = new OrderContentVo();
		orderContentVo.setOrderDetail(orderDetailVo);
		
		return orderContentVo;
	}
	
	/**
	 * 装饰  订单详情信息orderDetail 
	 * @param orderDetail
	 * @return
	 */
	private OrderDetailVo decorateOrderDetail(OrderDetail orderDetail) {
		
		OrderDetailVo orderDetailVo = new OrderDetailVo();
		BeanUtils.copyProperties(orderDetail, orderDetailVo);
		orderDetailVo.setDeclEntNo(companyManager.getGzeportCodeById(orderDetail.getDeclEntId()));
		orderDetailVo.setDeclEntName(companyManager.getNameById(orderDetail.getDeclEntId()));
		orderDetailVo.setEbEntNo(companyManager.getGzeportCodeById(orderDetail.getEbEntId()));
		orderDetailVo.setEbEntName(companyManager.getNameById(orderDetail.getEbEntId()));
		orderDetailVo.setEbpEntNo(companyManager.getGzeportCodeById(orderDetail.getEbpEntId()));
		orderDetailVo.setEbpEntName(companyManager.getNameById(orderDetail.getEbpEntId()));
		orderDetailVo.setCustomsName(baseInfoManager.getCustomsNameByCode(orderDetail.getCustomsCode()));
		orderDetailVo.setCiqOrgName(baseInfoManager.getCiqOrgNameByCode(orderDetail.getCiqOrgCode()));
		orderDetailVo.setOrderStatusDesc(OrderStatusEnum.DescOf(orderDetail.getOrderStatus()));
		orderDetailVo.setPayStatusDesc(PayStatusEnum.DescOf(orderDetail.getPayStatus()));
		orderDetailVo.setOrderGoodTotalCurrName(baseInfoManager.getCurrencyNameByCode(orderDetail.getOrderGoodTotalCurr()));
		orderDetailVo.setRecipientCountryName(baseInfoManager.getCountryNameByCode(orderDetail.getRecipientCountry()));
		orderDetailVo.setRecipientProvincesName(baseInfoManager.getProvinceNameByCode(orderDetail.getRecipientProvincesCode()));
		orderDetailVo.setOrderDocTypeDesc(OrderDocTypeEnum.DescOf(orderDetail.getOrderDocType()));
		orderDetailVo.setInvoiceTypeDesc(InvoiceTypeEnum.DescOf(orderDetail.getInvoiceType()));
		orderDetailVo.setCusMessageStatusOrderDesc(orderDetail.getCusMessageStatusOrder() == null ? null : StatusEnum.DescOf(orderDetail.getCusMessageStatusOrder()));
		orderDetailVo.setCiqMessageStatusOrderDesc(orderDetail.getCiqMessageStatusOrder() == null ? null : StatusEnum.DescOf(orderDetail.getCiqMessageStatusOrder()));
		
		orderDetailVo.setGoodsList(decorateOrderGoodsList(orderDetail.getGoodsList()));
		
		return orderDetailVo;
	}
	
	private List<OrderGoodsListVo> decorateOrderGoodsList(List<OrderGoodsList> goodsList) {
		
		List<OrderGoodsListVo> goodsListVos = new ArrayList<OrderGoodsListVo>();
		for (OrderGoodsList goods : goodsList) {
			goodsListVos.add(decorateOrderGoods(goods));
		}
		
		return goodsListVos;
	}
	
	private OrderGoodsListVo decorateOrderGoods(OrderGoodsList orderGoods) {
		OrderGoodsListVo vo = new OrderGoodsListVo();
		BeanUtils.copyProperties(orderGoods, vo);
		vo.setOriginCountryName(baseInfoManager.getCountryNameByCode(orderGoods.getOriginCountry()));
		vo.setUnitName(baseInfoManager.getUnitNameByCode(orderGoods.getUnit()));
		vo.setCurrCodeName(baseInfoManager.getCurrencyNameByCode(orderGoods.getCurrCode()));
		
		return vo;
	}
	
	@Override
	public PageInfo<OrderDetailListVo> listOrderDetailByConditions(OrderDetailQueryDto queryDto) {
		Integer pageNum = queryDto.getPageNum()==null ? 1 : queryDto.getPageNum();
		Integer pageSize = queryDto.getPageSize()==null ? 10 : queryDto.getPageSize();
		Example example = createOrderDetailExample(queryDto);
		PageHelper.startPage(pageNum, pageSize);
		List<OrderDetail> orderDetailList = orderDetailMapper.selectByExample(example);
		List<OrderDetailListVo> orderDetailVos = decorateOrderDetail(orderDetailList);
		return new PageInfo<OrderDetailListVo>(orderDetailVos);
	}
	
	private List<OrderDetailListVo> decorateOrderDetail(List<OrderDetail> orderDetailList) {
		List<OrderDetailListVo> orderDetailListVos = new ArrayList<OrderDetailListVo>();
		for (OrderDetail orderDetail : orderDetailList) {
			OrderDetailListVo vo = new OrderDetailListVo();
			BeanUtils.copyProperties(orderDetail, vo);
			vo.setEbEntName(companyManager.getNameById(orderDetail.getEbEntId()));
			vo.setDeclEntName(companyManager.getNameById(orderDetail.getDeclEntId()));
			vo.setCusMessageStatusOrderDesc(StatusEnum.DescOf(orderDetail.getCusMessageStatusOrder()));
			vo.setCiqMessageStatusOrderDesc(StatusEnum.DescOf(orderDetail.getCiqMessageStatusOrder()));
			orderDetailListVos.add(vo);
		}
		return orderDetailListVos;
	}
	
	private Example createOrderDetailExample(OrderDetailQueryDto queryDto) {
		Example example = new Example(OrderDetail.class);
		example.selectProperties("id","cusMessageStatusOrder","cusOrderReturnInfo","ciqMessageStatusOrder",
				"ciqOrderReturnInfo","entOrderNo","createAt","declEntId","ebEntId");
		Criteria cri = example.createCriteria();
		// 申报企业ID
//		Integer declEntId = TokenManager.getCompanyId();
		Integer declEntId = companyManager.getCompanyIdByGzeportCode(queryDto.getDeclEntNo());
		if (null != declEntId) {
			cri.andEqualTo("declEntId", declEntId);
		}
		// 电商企业ID
		Integer ebEntId = companyManager.getCompanyIdByGzeportCode(queryDto.getEbEntNo());
		if (null != ebEntId) {
			cri.andEqualTo("ebEntId", ebEntId);
		}
		// 入库时间起
		if (queryDto.getStartAt() != null) {
			cri.andGreaterThan("createAt", queryDto.getStartAt());
		}
		//入库时间末
		if (queryDto.getEndAt() != null) {
			cri.andLessThan("createAt", queryDto.getEndAt());
		}
		// 企业订单编号
		if (StringUtils.isNotBlank(queryDto.getEntOrderNo())) {
			String[] entOrderNoArray = queryDto.getEntOrderNo().split(",");
			cri.andIn("entOrderNo", Arrays.asList(entOrderNoArray));
		}
		// 电子运单编号
//		if (StringUtils.isNotBlank(queryDto.getWaybillNo())) {
//			String[] waybillNoArray = queryDto.getWaybillNo().split(",");
//			cri.andIn("waybillNo", Arrays.asList(waybillNoArray));
//		}
		// 支付交易编号
//		if (StringUtils.isNotBlank(queryDto.getPayNo())) {
//			String[] payNoArray = queryDto.getPayNo().split(",");
//			cri.andIn("payNo", Arrays.asList(payNoArray));
//		}
		// 海关电子订单状态
		if (StringUtils.isNotBlank(queryDto.getCusMessageStatusOrder())) {
			String[] cusMessageStatusOrderArray = queryDto.getCusMessageStatusOrder().split(",");
			cri.andIn("cusMessageStatusOrder", Arrays.asList(cusMessageStatusOrderArray));
		}
		// 国检电子订单状态
		if (StringUtils.isNotBlank(queryDto.getCiqMessageStatusOrder())) {
			String[] ciqMessageStatusOrderArray = queryDto.getCiqMessageStatusOrder().split(",");
			cri.andIn("ciqMessageStatusOrder", Arrays.asList(ciqMessageStatusOrderArray));
		}
		example.orderBy("id").desc();
		return example;
	}

	@Async
	@EventListener
	public void createMessageAsync(KJ881111MessageCreateEvent event) {
		
		OrderHead orderHead = event.getOrderHead();
		List<SendMessage> messageList = new ArrayList<SendMessage>();
		for (OrderDetail orderDetail : orderHead.getOrderContent()) {
			SendMessage sendMessage = createKJ881101Message(orderHead, orderDetail);
			messageList.add(sendMessage);
		}
		
		//批量生成报文
		sendMessageMapper.insertList(messageList);
		// 更新订单申报头状态为2-已申报
		orderHeadMapper.updateDeclStatusAndTimeById(orderHead.getId(), "2");
		// 更新订单明细状态为 1-待申报
		orderDetailMapper.updateMessageStatusByOrderHeadIdAndFunctionCode(orderHead.getId(), orderHead.getFunctionCode(), "1");
		
		LoggerUtils.info(this.getClass(), "监听到 KJ881111MessageCreateEvent 事件");
	}
	
	private SendMessage createKJ881101Message(OrderHead orderHeadPO, OrderDetail orderDetailPO) {
		
		InternationalTrade inter = new InternationalTrade();
		
		InternationalTrade.Head head = new InternationalTrade.Head();
		head.setMessageID(MessageIDCreater.create(MessageType.ORDER, companyManager.getIdMapCompany().get(orderHeadPO.getDeclEntId()).getEdiCode()));
		head.setMessageType(MessageType.ORDER);
		head.setSender(companyManager.getIdMapCompany().get(orderHeadPO.getDeclEntId()).getEdiCode());
		head.setReceiver("KJPUBLICPT");
		head.setSendTime(DateFormatUtil.yyyyMMddHHmmssFormat(new Date()));
		head.setFunctionCode(orderHeadPO.getFunctionCode());
		head.setVersion("3.0");
		inter.setHead(head);
		
		InternationalTrade.Declaration declaration = new InternationalTrade.Declaration();
		
		InternationalTrade.Declaration.OrderHead orderHead = new InternationalTrade.Declaration.OrderHead();
		orderHead.setDeclEntNo(companyManager.getGzeportCodeById(orderHeadPO.getDeclEntId()));
		orderHead.setDeclEntName(companyManager.getNameById(orderHeadPO.getDeclEntId()));
		orderHead.setEBEntName(companyManager.getNameById(orderHeadPO.getEbEntId()));
		orderHead.setEBEntNo(companyManager.getGzeportCodeById(orderHeadPO.getEbEntId()));
		orderHead.setEBPEntName(companyManager.getNameById(orderHeadPO.getEbpEntId()));
		orderHead.setEBPEntNo(companyManager.getGzeportCodeById(orderHeadPO.getEbpEntId()));
		orderHead.setIeFlag(orderHeadPO.getIeFlag());
		orderHead.setCustomsCode(orderHeadPO.getCustomsCode());
		orderHead.setCIQOrgCode(orderHeadPO.getCiqOrgCode());
		orderHead.setOpType(orderHeadPO.getOpType());
		orderHead.setInternetDomainName(orderHeadPO.getInternetDomainName());
		orderHead.setDeclTime(DateFormatUtil.yyyyMMddHHmmssFormat(new Date()));
		declaration.setOrderHead(orderHead);
		
		InternationalTrade.Declaration.OrderList orderList = new InternationalTrade.Declaration.OrderList();
		List<InternationalTrade.Declaration.OrderList.OrderContent> orderContent = new ArrayList<InternationalTrade.Declaration.OrderList.OrderContent>();
		
		InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail orderDetail = new InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail();

		BeanUtils.copyProperties(orderDetailPO, orderDetail);
//		orderDetail.setEntOrderNo(orderDetailPO.getEntOrderNo());
//		orderDetail.setOrderStatus(orderDetailPO.getOrderStatus());
//		orderDetail.setPayStatus(orderDetailPO.getPayStatus());
//		orderDetail.setOrderGoodTotal(orderDetailPO.getOrderGoodTotal());
//		orderDetail.setOrderGoodTotalCurr(orderDetailPO.getOrderGoodTotalCurr());
//		orderDetail.setFreight(orderDetailPO.getFreight());
//		orderDetail.setTax(orderDetailPO.getTax());
//		orderDetail.setOtherPayment(orderDetailPO.getOtherPayment());
//		orderDetail.setOtherPayNotes(orderDetailPO.getOtherPayNotes());
//		orderDetail.setOtherCharges(orderDetailPO.getOtherCharges());
//		orderDetail.setActualAmountPaid(orderDetailPO.getActualAmountPaid());
//		orderDetail.setRecipientName(orderDetailPO.getRecipientName());
//		orderDetail.setRecipientAddr(orderDetailPO.getRecipientAddr());
//		orderDetail.setRecipientTel(orderDetailPO.getRecipientTel());
//		orderDetail.setRecipientCountry(orderDetailPO.getRecipientCountry());
//		orderDetail.setRecipientProvincesCode(orderDetailPO.getRecipientProvincesCode());
		
		orderDetail.setOrderDocAcount(orderDetailPO.getOrderDocAccount());
//		orderDetail.setOrderDocName(orderDetailPO.getOrderDocName());
//		orderDetail.setOrderDocType(orderDetailPO.getOrderDocType());
//		orderDetail.setOrderDocId(orderDetailPO.getOrderDocId());
//		orderDetail.setOrderDocTel(orderDetailPO.getOrderDocTel());
		orderDetail.setOrderDate(DateFormatUtil.yyyyMMddHHmmssFormat(orderDetailPO.getOrderDate()));
		
		InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList goodsList = 
				new InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList();
		
		List<InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList> goodsListList = 
				new ArrayList<InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList>();
		int i = 1;
		for (OrderGoodsList orderGoodsListPO : orderDetailPO.getGoodsList()) {
			InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList orderGoodsList = 
					new InternationalTrade.Declaration.OrderList.OrderContent.OrderDetail.GoodsList.OrderGoodsList();
			BeanUtils.copyProperties(orderGoodsListPO, orderGoodsList);
			orderGoodsList.setSeq(i++);
			orderGoodsList.setCIQGoodsNo(orderGoodsListPO.getCiqGoodsNo());
			orderGoodsList.setHSCode(orderGoodsListPO.getHsCode());
			goodsListList.add(orderGoodsList);
		}
		
		goodsList.setOrderGoodsList(goodsListList);
		orderDetail.setGoodsList(goodsList);
		orderContent.add(new InternationalTrade.Declaration.OrderList.OrderContent(orderDetail));
		orderList.setOrderContent(orderContent);
		declaration.setOrderHead(orderHead);
		declaration.setOrderList(orderList);
		
		inter.setDeclaration(declaration);
		inter.setHead(head);
		
		SendMessage sendMessage = new SendMessage();
		sendMessage.setDeclEntId(orderHeadPO.getDeclEntId());
		sendMessage.setDeclMode(orderHeadPO.getDeclMode());
		sendMessage.setDetailId(orderDetailPO.getId());
		sendMessage.setMessageId(head.getMessageID());
		sendMessage.setMessageType(head.getMessageType());
		sendMessage.setIeFlag(orderHead.getIeFlag());
		sendMessage.setSender(head.getSender());
		sendMessage.setReceiver(head.getReceiver());
		sendMessage.setVersion(head.getVersion());
		sendMessage.setFunctionCode(head.getFunctionCode());
		
		String messageDetail = "";
		try {
			messageDetail = JAXBUtil.createXml(inter);
			sendMessage.setStatus("1");
			
		} catch(Exception e) {
			sendMessage.setStatus("3");
			sendMessage.setDescription("生成跨境公共服务平台报文失败：" + e.getMessage());
		}
		
		sendMessage.setMessageDetail(messageDetail);
		
		return sendMessage;
	}

	@Override
	@Transactional
	public BaseResult<Object> importOrderByExcel(MultipartFile file) {
		
		//第一层校验（excel -> obj）
		OrderImportResult result = null;
		try {
			result = importExcelVerify(file);
			
			if (result.isVerfiyFail()) {
				if (result.getMsg().toString().length() > 255) {
					return new BaseResult<Object>(false, result.getMsg().toString().substring(0, 254)+ "...");
				}
				return new BaseResult<Object>(false, result.getMsg().toString());
			}
			
		} catch (Exception e) {
			LoggerUtils.error(this.getClass(), "excel读取失败:", e);
			return new BaseResult<>(false, "excel读取失败：" + e.getMessage());
		}
		
		batchInsert(result.getOrderHead());
		
		KJ881111MessageCreateEvent createMessageEvent = new KJ881111MessageCreateEvent(this, result.getOrderHead());
        applicationContext.publishEvent(createMessageEvent);
		
		
		return new BaseResult<Object>(true, "导入完成");
	}
	
	/**
	 * 订单excel 转化为对应java对象
	 * @param f
	 * @return
	 * @throws Exception
	 */
	private OrderImportResult importExcelVerify(MultipartFile f) throws Exception {
		
		StringBuilder msgBuilder = new StringBuilder("");

		OrderImportResult orderImportResult = new OrderImportResult();
		//sheet1(电子订单头)导入
		ImportParams params1 = new ImportParams();
		params1.setNeedVerfiy(true);
		params1.setTitleRows(1);
		params1.setStartSheetIndex(0);
		params1.setVerifyHandler(new OrderHeadExcelVerifyHandler());
		OrderHead orderHead = new OrderHead();
		ExcelImportResult<OrderHeadPoiEntityOfMode> result =  ExcelImportUtil.importExcelMore(f.getInputStream(), OrderHeadPoiEntityOfMode.class, params1);
		if (result.isVerfiyFail()) {
			for (OrderHeadPoiEntityOfMode o : result.getFailList()) {
				msgBuilder.append(o.getErrorMsg());
			}
			return new OrderImportResult(true, "sheet1【电子订单头】导入数据校验失败：" + msgBuilder.toString());
		} else {
			if(result.getList().size() == 0 || result.getList().size() > 1) {
				return new OrderImportResult(true, "sheet1【电子订单头】导入数据校验失败：" + "电子订单头有且只能有一条数据");
			} else {

				//电子订单头检验通过
				BeanUtils.copyProperties(result.getList().get(0), orderHead);
				orderHead.setCreateUserId(TokenManager.getUserId());
				orderHead.setDeclEntId(TokenManager.getCompanyId());
				orderHead.setDeclMode("HTTPS");
				orderImportResult.setOrderHead(orderHead);
			}
		}

		//sheet2(电子订单明细)导入
		ImportParams params2 = new ImportParams();
		params2.setNeedVerfiy(true);
		params2.setTitleRows(1);
		params2.setStartSheetIndex(1);
		params2.setVerifyHandler(new OrderDetailExcelVerifyHandler());
		ExcelImportResult<OrderDetailPoiEntityOfMode> result2 =  ExcelImportUtil.importExcelMore(f.getInputStream(), OrderDetailPoiEntityOfMode.class, params2);
		Map<String, OrderDetail> orderNoMapOrderDetail = new HashMap<String, OrderDetail>();
		if (result2.isVerfiyFail()) {
			for (OrderDetailPoiEntityOfMode o : result2.getFailList()) {
				msgBuilder.append(o.getErrorMsg());
			}
			return new OrderImportResult(true, "sheet2【电子订单明细】导入数据校验失败：" + msgBuilder.toString());
		} else {
			if (result2.getList().size() < 1) {
				return new OrderImportResult(true, "sheet2【电子订单明细】导入数据校验失败：电子订单明细不能为空");
			} else {
				// 
				for (OrderDetailPoiEntityOfMode o : result2.getList()) {
					OrderDetail orderDetail = new OrderDetail();
					BeanUtils.copyProperties(o, orderDetail);
					orderDetail.setEbEntId(orderHead.getEbEntId());
					orderDetail.setEbpEntId(orderHead.getEbpEntId());
					orderDetail.setCustomsCode(orderHead.getCustomsCode());
					orderDetail.setCiqOrgCode(orderHead.getCiqOrgCode());
					orderDetail.setDeclEntId(orderHead.getDeclEntId());
					orderDetail.setCreateUserId(orderHead.getCreateUserId());
					orderDetail.setIeFlag(orderHead.getIeFlag());
					orderNoMapOrderDetail.put(o.getEntOrderNo(), orderDetail);

				}
				
				// 新增申报时检验是否重复申报
				if (orderHead.getOpType().equals("A")) {
					Set<String> orderNotSet = orderNoMapOrderDetail.keySet();
					List<OrderDetail> l = orderDetailMapper.findByEbEntIdAndEntOrderNoSet(orderHead.getEbEntId(), orderNotSet);
					for (OrderDetail orderDetail : l) {
						if(orderHead.getFunctionCode().equals("BOTH") && !orderDetail.isBothOrderEditable()) {
							msgBuilder.append("企业订单编号【" + orderDetail.getEntOrderNo() + "】重复申报,");
						} else if(orderHead.getFunctionCode().equals("CUS") && !orderDetail.isCusOrderEditable()) {
							msgBuilder.append("企业订单编号【" + orderDetail.getEntOrderNo() + "】重复申报,");
						} else if (orderHead.getFunctionCode().equals("CIQ") && !orderDetail.isCiqOrderEditable()) {
							msgBuilder.append("企业订单编号【" + orderDetail.getEntOrderNo() + "】重复申报,");
						}
					}
				}
				
				if (msgBuilder.toString().length() > 5) {
					return new OrderImportResult(true, "sheet2【电子订单明细】导入数据校验失败：" + msgBuilder.toString());
				}
				// 电子订单明细检验通过
			}
		}

		//sheet3(订单商品) 导入
		ImportParams params3 = new ImportParams();
		params3.setNeedVerfiy(true);
		params3.setTitleRows(1);
		params3.setStartSheetIndex(2);
		params3.setVerifyHandler(new OrderGoodsListExcelVerifyHandler());
		ExcelImportResult<OrderGoodsListPoiEntityOfMode> result3 = ExcelImportUtil.importExcelMore(f.getInputStream(), OrderGoodsListPoiEntityOfMode.class, params3);

		if (result3.isVerfiyFail()) {
			for (OrderGoodsListPoiEntityOfMode o : result3.getFailList()) {
				msgBuilder.append(o.getErrorMsg());
			}
			return new OrderImportResult(true,"sheet3【订单商品】导入数据校验失败："+  msgBuilder.toString());
		} else {
			if (result3.getList().size() < 1) {
				return new OrderImportResult(true,"sheet3【订单商品】导入数据校验失败：订单商品不能为空");
			} else {
				for (OrderGoodsListPoiEntityOfMode o : result3.getList()) {
//					System.out.println(FastJsonUtils.toJSONNoFeatures(o));
					if (orderNoMapOrderDetail.get(o.getEntOrderNo()) != null) {
						OrderGoodsList orderGoodsList = new OrderGoodsList();
						BeanUtils.copyProperties(o, orderGoodsList);
						orderNoMapOrderDetail.get(o.getEntOrderNo()).addGoodsList(orderGoodsList);

					} else { //订单商品中 订单号 无对应订单明细关联
						msgBuilder.append("订单商品【" + o.getEntOrderNo()+ "】无对应电子订单信息,");
					}
				}

				//判断所有订单都有至少一条对应的商品信息
				for (Map.Entry<String, OrderDetail> entry : orderNoMapOrderDetail.entrySet()) {
					OrderDetail d = entry.getValue();
					if (d.getGoodsList() == null || d.getGoodsList().size() < 1) {
						msgBuilder.append("企业电子订单【" + d.getEntOrderNo()+ "】无对应商品信息,");
					}
				}
				// 
				if (msgBuilder.toString().length() > 5) {
					return new OrderImportResult(true, "sheet3【订单商品】导入数据校验失败：" + msgBuilder.toString());
				}
				
				orderImportResult.getOrderHead().setOrderContent((new ArrayList<OrderDetail>(orderNoMapOrderDetail.values())));
			}
		}
		orderImportResult.setVerfiyFail(false);
		return orderImportResult;
	}
	
	
	private void batchInsert(OrderHead orderHead) {

		orderHeadMapper.insert(orderHead);
		int orderHeadId = orderHead.getId();
		for (OrderDetail orderDetail : orderHead.getOrderContent()) {
			orderDetail.setOrderHeadId(orderHeadId);
		}

		orderDetailMapper.insertList(orderHead.getOrderContent());

		List<OrderGoodsList> orderGoods = new ArrayList<OrderGoodsList>();
		for (OrderDetail orderDetail : orderHead.getOrderContent()) {
			for (OrderGoodsList goods : orderDetail.getGoodsList()) {
				goods.setOrderDetailId(orderDetail.getId());
				orderGoods.add(goods);
			}
		}
		orderGoodsListMapper.insertList(orderGoods);

	}



}
