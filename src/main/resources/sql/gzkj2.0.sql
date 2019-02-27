
#电商企业(e-commerce business enterprise)
#电商平台(e-commerce business platform)
#物流企业(e-commerce house transport)

DROP table if  EXISTS order_head;

-- 电子订单申报头部信息
create table order_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  e_b_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  e_b_p_ent_id int(10) NOT NULL COMMENT '所属电商平台ID',
  internet_domain_name varchar(512) COMMENT '电商平台互联网域名',
  decl_time DATETIME NULL COMMENT '申报时间',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  proposer_type varchar(1) COMMENT '经营者类型(1 - 企业； 2 - 个人；默认为1；)',
  proposer_id varchar(18) COMMENT '经营者身份标识号(默认为电商企业的单一窗口备案社会信用代码)',
  proposer_name varchar(100) COMMENT '经营者名称(默认为电商企业名称)',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  cus_flag tinyint(1) COMMENT '是否发送海关',
  ciq_flag tinyint(1) COMMENT '是否报送国检',
  
  central_id int(10) COMMENT '关联集中申报表头ID',
  order_detail_ids varchar(255) COMMENT '关联订单详情id集合',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS order_detail;

-- 电子订单详情信息
create table order_detail(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  order_head_id int(10) COMMENT '关联电子订单表头ID',
  ent_order_no varchar(60) NOT NULL  COMMENT '企业电子订单编号',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  e_b_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  e_b_p_ent_id int(10) NOT NULL COMMENT '所属电商平台ID',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  order_status varchar(1) COMMENT '电子订单状态（0-订单确认；1-订单完成；2-订单取消）',
  pay_status varchar(1) COMMENT '支付状态（0-已付款；1-未付款）',
  order_good_total decimal(19,5) COMMENT '订单商品总额',
  order_good_total_curr varchar(3) COMMENT '订单商品总额币制',
  freight decimal(19,5) COMMENT '订单运费(无则填“0”)',
  checking_no varchar(100) COMMENT '快递物流运单编号',
  delivery_ent varchar(100) COMMENT '快递物流配送企业',
  tax decimal(19,5) COMMENT '税款(无则填“0”)',
  other_payment decimal(19,5) COMMENT '抵付金额(优惠减免金额，无则填“0”)',
  other_pay_notes varchar(1024) COMMENT '抵付说明',
  other_charges decimal(19,5) COMMENT '其他费用(无则填“0”)',
  actual_amount_paid decimal(19,5) COMMENT '实际支付金额（货款+运费+税款-优惠金额，与支付保持一致（精确到元））',
  recipient_name varchar(100) COMMENT '收货人名称，同运单',
  recipient_addr varchar(200) COMMENT '收货人地址，同运单',
  recipient_tel varchar(50) COMMENT '收货人电话，同运单',
  recipient_country varchar(8) COMMENT '收货人所在国家代码',
  recipient_provinces_code varchar(6) COMMENT '收货人行政区代码',
  order_doc_account varchar(60) COMMENT '下单人账户',
  order_doc_name varchar(60) COMMENT '下单人姓名',
  order_doc_type varchar(2) COMMENT '下单人证件类型（01:身份证、02:护照、04:其他）',
  order_doc_id varchar(60) COMMENT '下单人证件号(默认为身份证号)',
  order_date DATETIME NULL COMMENT '订单日期',
  batch_numbers varchar(100) COMMENT '商品批次号',
  invoice_type varchar(1) COMMENT '发票类型（1- 电子发票；2- 普通发票（纸质）；3- 专用发票（纸质）；0- 其它；）',
  invoice_no varchar(20) COMMENT '发票编号',
  invoice_title varchar(100) COMMENT '发票抬头',
  invoice_identify_id varchar(30) COMMENT '纳税人标志号',
  invoice_desc varchar(200) COMMENT '发票内容',
  invoice_amount decimal(19,5) COMMENT '发票金额',
  invoice_date DATETIME NULL COMMENT '开票日期',
  note varchar(1000) COMMENT '备注',
  
  cus_message_status_order varchar(10) DEFAULT '0' COMMENT '海关电子订单状态',
  cus_order_return_info varchar(1000) COMMENT '海关订单回执内容',
  
  ciq_message_status_order varchar(10) DEFAULT '0' COMMENT '国检电子订单状态',
  ciq_order_return_info varchar(1000) COMMENT '国检订单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS order_goods_list;

-- 订单商品信息
create table order_goods_list(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  order_detail_id int(10) COMMENT '关联电子订单详情ID',
  seq decimal(4) COMMENT '商品序号',
  ent_goods_no varchar(30) COMMENT '企业商品自编号',
  ciq_goods_no varchar(36) COMMENT '检验检疫商品备案编号',
  cus_goods_no varchar(50) COMMENT '海关正式备案编号',
  h_s_code varchar(10) COMMENT 'HS编码',
  goods_name varchar(250) COMMENT '企业商品品名',
  goods_style varchar(200) COMMENT '规格型号',
  goods_describe varchar(1000) COMMENT '企业商品描述',
  origin_country varchar(3) COMMENT '原产国代码',
  origin_place varchar(100) COMMENT '产地',
  manufacturer varchar(100) COMMENT '厂家',
  manufacturer_id varchar(18) COMMENT '厂家标识号',
  batch_numbers varchar(100) COMMENT '商品批次号',
  production_date varchar(8) COMMENT '生产日期',
  bar_code varchar(20) COMMENT '商品条形码',
  brand varchar(100) COMMENT '品牌',
  ip_code varchar(100) COMMENT '知识产权编号',
  qty decimal(19,5) COMMENT '数量',
  unit varchar(3) COMMENT '计量单位',
  price decimal(19,5) COMMENT '单价',
  total decimal(19,5) COMMENT '总价',
  curr_code varchar(3) COMMENT '币制',
  notes varchar(1000) COMMENT '备注',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS waybill_head;

-- 电子运单申报头部信息
create table waybill_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  e_h_s_ent_id int(10) NOT NULL COMMENT '所属物流企业ID',
  decl_time DATETIME NULL COMMENT '申报时间',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  trans_mode varchar(4) COMMENT '出口方式(1210 - 保税出口；9610 - 直邮出口；0010 - 批量出口，海外仓模式；)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  cus_flag tinyint(1) COMMENT '是否发送海关',
  ciq_flag tinyint(1) COMMENT '是否报送国检',
  
  central_id int(10) COMMENT '关联集中申报表头ID',
  waybill_detail_ids varchar(255) COMMENT '关联运单详情id集合',

  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS waybill_detail;

-- 电子运单详情信息
create table waybill_detail(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  waybill_head_id int(10) COMMENT '关联电子运单表头ID',
  ent_waybill_no varchar(30) COMMENT '企业电子运单编号',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  e_h_s_ent_id int(10) NOT NULL COMMENT '所属物流企业ID',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  ent_order_no varchar(30) COMMENT '企业电子订单号',
  bill_no varchar(30) COMMENT '提运单号',
  out_date DATETIME NULL COMMENT '出仓/进境日期',
  discharge_place varchar(50) COMMENT '货物存放地',
  e_h_s_batch_no varchar(60) COMMENT '物流批次号',
  create_date DATETIME NULL COMMENT '运单创建日期',
  route_status varchar(600) COMMENT '路由状态',
  waybill_status varchar(1) COMMENT '电子运单状态',
  fee_rate decimal(19,5) COMMENT '运费/率',
  fee_curr_code varchar(3) COMMENT '运费币制',
  fee_mark varchar(1) COMMENT '运费标志（1代表率；2代表单价；3代表总价）',
  insur_rate decimal(19,5) COMMENT '保费/率',
  other_date decimal(19,5) COMMENT '杂费/率',
  total_amount decimal(19,5) COMMENT '',
  pack_no decimal(19) COMMENT '件数',
  net_wt decimal(18,4) COMMENT '净重',
  gross_wt decimal(19,5) COMMENT '毛重',
  goods_detail varchar(200) COMMENT '商品信息',
  recipient_name varchar(100) COMMENT '收货人名称',
  recipient_addr varchar(200) COMMENT '收货人地址',
  recipient_tel varchar(50) COMMENT '收货人电话',
  recipient_country varchar(3) COMMENT '收货人所在国家代码',
  recipient_provinces_code varchar(6) COMMENT '收件人省市区代码',
  shipper_name varchar(100) COMMENT '发货人名称',
  shipper_datailed_address varchar(200) COMMENT '发货人地址',
  shipper_phone varchar(60) COMMENT '发货人电话',
  shipper_country_code varchar(3) COMMENT '发货人所在国家代码',
  shipper_provinces_code varchar(6) COMMENT '发货人省市区代码',
  notes varchar(1000) COMMENT '备注',
  
  cus_message_status_waybill varchar(10) DEFAULT '0' COMMENT '海关电子运单状态',
  cus_waybill_return_info varchar(1000) COMMENT '海关运单回执内容',
  
  ciq_message_status_waybill varchar(10) DEFAULT '0' COMMENT '国检电子运单状态',
  ciq_waybill_return_info varchar(1000) COMMENT '国检运单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS payment_head;

-- 电子支付单申报头部信息
create table payment_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  pay_ent_id int(10) NOT NULL COMMENT '支付企业ID',
  decl_time DATETIME NULL COMMENT '申报时间',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  cus_flag tinyint(1) COMMENT '是否发送海关',
  ciq_flag tinyint(1) COMMENT '是否报送国检',
  
  central_id int(10) COMMENT '关联集中申报表头ID',
  payment_detail_ids varchar(255) COMMENT '关联支付单详情id集合',

  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS payment_detail;

-- 电子支付单详情信息
create table payment_detail(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  payment_head_id int(10) COMMENT '关联电子支付单表头ID',
  ent_pay_no varchar(50) COMMENT '支付交易编号',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  pay_ent_id int(10) NOT NULL COMMENT '支付企业ID',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  pay_status varchar(2) COMMENT '支付交易状态',
  pay_amount decimal(19,5) COMMENT '支付金额',
  pay_curr_code varchar(3) COMMENT '支付币制',
  pay_time DATETIME NULL COMMENT '付款时间',
  payer_name varchar(60) COMMENT '支付人姓名',
  payer_document_type varchar(2) COMMENT '支付人证件类型(01:身份证;02:护照;04:其他)',
  payer_document_number varchar(60) COMMENT '支付人证件号码',
  ent_order_no varchar(60) COMMENT '电子订单编号',
  e_b_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  notes varchar(1000) COMMENT '备注',

  cus_message_status_pay varchar(10) DEFAULT '0' COMMENT '海关电子支付单状态',
  cus_pay_return_info varchar(1000) COMMENT '海关支付单回执内容',
  
  ciq_message_status_pay varchar(10) DEFAULT '0' COMMENT '国检电子支付单状态',
  ciq_pay_return_info varchar(1000) COMMENT '国检支付单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP table if  EXISTS e_list_head;

-- 电子清单申报头部
create table e_list_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  e_b_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  internet_domain_name varchar(512) COMMENT '电商平台互联网域名',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  apply_sea_port varchar(4) COMMENT '申报口岸 关区代码',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  trade_mode varchar(4) COMMENT '贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)',
  e_list_type varchar(2) COMMENT '清单类型',
--  total_count decimal(9) COMMENT '清单总票数',
--  total_weight decimal(19,5) COMMENT '总重量',
--  total_pack_num decimal(9) COMMENT '商品总件数',
--  total_value decimal(19,5) COMMENT '总货值',
  curr_code varchar(3) COMMENT '货币代码',
  decl_time DATETIME NULL COMMENT '申报时间',
  input_date DATETIME NULL COMMENT '录入日期',
  input_staff_id int(10) COMMENT '录入员ID',
  comp_access_id int(10) NOT NULL COMMENT '报关企业ID',
  customs_declarer_id int(10) COMMENT '报关员ID',
  
  check_documents varchar(1) COMMENT '核对单证(是否需要进行三单预比对。0 - 不需要比对；（默认）1 - 需要比对(对于三单全部从本平台发送的数据，才需设置比对。))',
  proposer_type varchar(1) COMMENT '经营者类型',
  proposer_id varchar(18) COMMENT '经营者身份标识号',
  proposer_name varchar(100) COMMENT '经营者名称(不填默认为电商企业名称)',
  
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  cus_flag tinyint(1) COMMENT '是否发送海关',
  ciq_flag tinyint(1) COMMENT '是否报送国检',

  central_id int(10) COMMENT '关联集中申报表头ID',
  e_list_detail_info_ids varchar(255) COMMENT '关联清单详情id集合',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS e_list_detail_info;

-- 电子清单详情信息
create table e_list_detail_info(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  e_list_head_id int(10) COMMENT '关联电子清单申报表头ID',
  ent_e_list_no varchar(20) COMMENT '清单编号(企业内部的清单编号)',
  
  comp_access_id int(10) NOT NULL COMMENT '报关企业ID',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  e_b_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  trade_mode varchar(4) COMMENT '贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)',
  
  tax_no varchar(64) COMMENT '税务编号',
  status varchar(1) COMMENT '征税状态',
  customs_tax decimal(19,5) COMMENT '关税',
  value_added_tax decimal(19,5) COMMENT '增值税',
  consumption_tax decimal(19,5) COMMENT '消费税',
  
  ent_order_no varchar(60) COMMENT '企业电子订单编号',
  ent_waybill_no varchar(30) COMMENT '企业电子运单编号',
  e_port_e_list_no varchar(18) COMMENT '跨境平台清单编号',
  pre_no varchar(18) COMMENT '预录入编号（电子口岸标识单证编号）',
  cus_e_list_no varchar(18) COMMENT '海关清单编号',
  ciq_e_list_no varchar(36) COMMENT '检验检疫清单编号',
  assure_id int(10) COMMENT '担保企业ID',
  i_e_port varchar(4) COMMENT '进出口岸代码',
  sv_p_code varchar(4) COMMENT '监管场所代码',
  i_e_date DATETIME NULL COMMENT '进出口日期',
  ems_no varchar(30) COMMENT '备案号/账册编号',
  area_id int(10) COMMENT '区内企业ID',
  license_no varchar(19) COMMENT '许可证号',
  trans_mode varchar(2) COMMENT '成交方式',
  use_to varchar(3) COMMENT '生成厂家/用途',
  bill_no varchar(37) COMMENT '提运单号/转关单号（直购进口必填。货物提单或运单的编号，直购必填。）',
  pack_ent_name varchar(60) COMMENT '组货单位名称',
  wrap_type varchar(4) COMMENT '外包装种类代码',
  pack_quantity int(10) COMMENT '包裹件数',
  trans_type varchar(1) COMMENT '运输工具类型（1 飞机；2 卡车；3 火车；4 船；9 其他）',
  trans_code varchar(1) COMMENT '运输方式代码',
  trans_no varchar(100) COMMENT '运输工具编号',
  voyage_no varchar(32) COMMENT '航班航次号',
  destination_country varchar(3) COMMENT '起运国/运抵国',
  destination_port varchar(4) COMMENT '起运港/抵运港',
  edest_date DATETIME NULL COMMENT '拟到达时间或出发时间（直购进口为拟抵达监管场所时间；保税进口为拟发货时间；出口为抵达监管场所时间。）',
  route_country varchar(3) COMMENT '经停地区或国家代码',
  consignee_name varchar(60) COMMENT '消费者名称',
  consignee_id_num varchar(30) COMMENT '消费者证件号码',
  consignee_card_type varchar(1) COMMENT '消费者证件类型代码（1-身份证；2-其它）',
  consignee_country varchar(3) COMMENT '消费者所在国家（地区）代码(进口填中国（142）；出口填目的国海关代码)',
  consignee_tel varchar(30) COMMENT '消费者联系电话号码',
  notes varchar(1000) COMMENT '备注',
  
  cus_message_status_list varchar(10) DEFAULT '0' COMMENT '海关电子清单状态',
  cus_list_return_info varchar(1000) COMMENT '海关清单回执内容',
  
  ciq_message_status_list varchar(10) DEFAULT '0' COMMENT '国检电子清单状态',
  ciq_list_return_info varchar(1000) COMMENT '国检清单回执内容',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS e_list_waybill;

-- 清单关联运单信息
create table e_list_waybill(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  e_list_detail_info_id int(10) COMMENT '关联清单详情信息ID',
  ent_waybill_no varchar(30) COMMENT '企业电子运单编号',
  e_h_s_ent_id int(10) COMMENT '所属物流企业ID',
  gross_weight decimal(19,5) COMMENT '毛重',
  net_wt decimal(19,5) COMMENT '净重',
  fee_rate decimal(19,5) COMMENT '运费',
  fee_mark varchar(1) COMMENT '运费标志（预留字段）（1代表率；2代表单价；3代表总价）',
  insur_rate decimal(19,5) COMMENT '保费',
  other_date decimal(19,5) COMMENT '杂费',
  recipient_name_c varchar(100) COMMENT '收件人中文名称',
  recipient_name_e varchar(100) COMMENT '收件人英文名称',
  recipient_card_type varchar(2) COMMENT '收件人证件类型（01:身份证、02:护照、03:其他）',
  recipient_no varchar(30) COMMENT '收发件人证件号',
  recipient_country varchar(3) COMMENT '收件人国家代码',
  recipient_provinces_code varchar(6) COMMENT '收件人省市区代码（进口需要填收货人所在行政区域代码；出口填出口省市区代码）',
  recipient_addr_c varchar(200) COMMENT '收件人中文地址',
  recipient_addr_e varchar(500) COMMENT '收件人英文地址',
  recipient_tel varchar(60) COMMENT '收件人电话',
  shipper_c varchar(255) COMMENT '发件人中文名称(电商或电商物流服务商中文名)',
  shipper_e varchar(255) COMMENT '发件人英文名称(电商或电商物流服务商英文名)',
  shipper_country varchar(3) COMMENT '发件人国家代码(进口填发货国或地区代码；出口填中国（142）)',
  shipper_provinces_code varchar(100) COMMENT '发件人城市（进口填境外城市名；出口填境内发货城市名）',
  shipper_addr_c varchar(500) COMMENT '发件人中文地址',
  shipper_addr_e varchar(500) COMMENT '发件人英文名称',
  notes varchar(1000) COMMENT '备注',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS e_list_pay;

-- 清单关联支付信息
create table e_list_pay(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  e_list_detail_info_id int(10) COMMENT '关联清单详情信息ID',
  ent_pay_no varchar(50) COMMENT '支付交易编号',
  pay_ent_id int(10) COMMENT '所属支付企业ID',
  ntoes varchar(1000) COMMENT '备注',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS e_list_order;

-- 清单关联订单表体
create table e_list_order(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  e_list_detail_info_id int(10) COMMENT '关联清单详情信息ID',
  e_b_p_ent_id  int(10) COMMENT '所属电商平台ID',
  ent_order_no varchar(60) COMMENT '企业电子订单编号',

  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS goods_detail_info;

-- 清单关联订单货物信息
create table goods_detail_info(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  e_list_order_id int(10) COMMENT '关联电子清单关联订单表体ID',
  seq decimal(3) COMMENT '商品序号',
  ciq_goods_no varchar(36) COMMENT '检验检疫商品备案编号',
  cus_goods_no varchar(30) COMMENT '海关商品备案号（总署申报1210 账册备案料号；总署申报9610 填行邮税号或HS编号）',
  ent_goods_no varchar(30) COMMENT '企业商品货号',
  goods_name varchar(200) COMMENT '企业商品品名',
  g_name varchar(200) COMMENT '海关商品归类名称',
  goods_style varchar(100) COMMENT '商品规格型号',
  h_s_code varchar(10) COMMENT 'Hs编码',
  brand varchar(50) COMMENT '品牌',
  bar_code varchar(50) COMMENT '商品条形码',
  origin_country varchar(3) COMMENT '原产国/ 消费国（进口填原产国或地区，填中国可能导致退单。出口填中国（142））',
  discharge_place varchar(200) COMMENT '货物存放地（1210进口为企业保税仓名称。9610进口为企业海外仓名称。出口为发货仓名称。）',
  goods_batch_no varchar(200) COMMENT '商品批次',
  license_no varchar(200) COMMENT '商品许可证号',
  appr_no varchar(200) COMMENT '商品批准文号',
  package_type varchar(8) COMMENT '包装类型',
  pack_num decimal(6) COMMENT '包装件数',
  qty decimal(19,5) COMMENT '数量',
  g_unit varchar(3) COMMENT '成交计量单位',
  std_unit varchar(3) COMMENT '第一计量单位',
  std_qty decimal(19,5) COMMENT '第一计量数量',
  sec_unit varchar(3) COMMENT '第二计量单位',
  sec_qty decimal(19) COMMENT '第二计量单位数量',
  gross_weight decimal(19,5) COMMENT '重量',
  unit_price decimal(19,5) COMMENT '商品单价',
  total_price decimal(19,5) COMMENT '商品总价',
  notes varchar(1000) COMMENT '备注',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS centralization_head;

-- 集中申报 头部信息
create table centralization_head(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  e_b_ent_id int(10) NOT NULL COMMENT '所属电商企业ID',
  e_b_p_ent_id int(10) NOT NULL COMMENT '所属电商平台ID',
  e_h_s_ent_id int(10) NOT NULL COMMENT '所属物流企业ID',
  pay_ent_id int(10) NOT NULL COMMENT '支付企业ID',
  comp_access_id int(10) NOT NULL COMMENT '报关企业ID',
  
  decl_time DATETIME NULL COMMENT '申报时间',
  op_type varchar(1) COMMENT '操作方式(A-新增M-变更D-删除)',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  trade_mode varchar(4) COMMENT '贸易方式(9610 - B2C 直邮模式;1210 - B2B2C 保税模式)',
  customs_code varchar(4) COMMENT '主管海关代码',
  ciq_org_code varchar(8) COMMENT '检验检疫机构代码',
  
  internet_domain_name varchar(512) COMMENT '电商平台互联网域名',
  proposer_type varchar(1) COMMENT '经营者类型(1 - 企业； 2 - 个人；默认为1；)',
  proposer_id varchar(18) COMMENT '经营者身份标识号(默认为电商企业的单一窗口备案社会信用代码)',
  proposer_name varchar(100) COMMENT '经营者名称(默认为电商企业名称)',
  
  apply_sea_port varchar(4) COMMENT '申报口岸 关区代码',
  e_list_type varchar(2) COMMENT '清单类型',
  curr_code varchar(3) COMMENT '货币代码',
  input_staff_id int(10) COMMENT '录入员ID',
  customs_declarer_id int(10) COMMENT '报关员ID',
  check_documents varchar(1) COMMENT '核对单证(是否需要进行三单预比对。0 - 不需要比对；（默认）1 - 需要比对(对于三单全部从本平台发送的数据，才需设置比对。))',
  
  notes varchar(1000) COMMENT '备注',
  
  decl_status varchar(32) COMMENT '申报状态',
  decl_mode varchar(32) COMMENT '报送方式',
  message_id varchar(60) COMMENT '报文编号',
  cus_flag tinyint(1) COMMENT '是否发送海关',
  ciq_flag tinyint(1) COMMENT '是否报送国检',
  
  decl_head_ids varchar(255) COMMENT '关联四单申报头部id集合',
  
  create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
  create_user_id int(10) COMMENT '数据录入用户ID',
  update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
  update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS send_message;

-- 发送报文
create table send_message(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
--  head_id int(10) COMMENT '申报头部ID',
  detail_id int(10) COMMENT '申报信息详情ID',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  message_id varchar(60) COMMENT '报文编号',
  message_type varchar(15) COMMENT '报文类型',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  sender varchar(30) COMMENT '报文发送者标识',
  receiver varchar(30) COMMENT '报文接收人标识',
  send_time DATETIME NULL COMMENT '发送时间',
  receive_time DATETIME NULL COMMENT '接收时间',
  
  decl_mode varchar(32) COMMENT '报送方式',
  status varchar(1) COMMENT '状态（0-未发送；1-待发送；2-发送成功；3-发送失败）',
  description varchar(255) COMMENT '报文发送结果描述',
  function_code varchar(10) COMMENT '业务类型',
  version varchar(10) COMMENT '版本号（默认3.0）',
  
  message_detail text COMMENT '报文详情',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS receive_message;

-- 接收报文
create table receive_message(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  decl_ent_id int(10) NOT NULL COMMENT '申报企业ID',
  business_no varchar(60) COMMENT '业务编号（企业内部唯一编号）',
  org_message_type varchar(30) COMMENT '旧（申报）报文类型',
  message_type varchar(15) COMMENT '报文类型',
  i_e_flag varchar(1) COMMENT '进出口标示(I-进口;E-出口)',
  sender varchar(30) COMMENT '报文发送者标识',
  receiver varchar(30) COMMENT '报文接收人标识',
  send_time  DATETIME NULL COMMENT '发送时间',
  receive_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '接收时间',
  response_by varchar(2) COMMENT '回执返回方（01-平台，02-海关，03-国检）',
  return_status varchar(10) COMMENT '回执状态编码',
  return_info varchar(1000) COMMENT '回执接收信息',
  message_id varchar(60) COMMENT '回执报文编号',
  
  message_detail text COMMENT '报文详情',
  
  result varchar(1) COMMENT '标识这份回执是否被成功处理(0-未处理，1-待处理，2-已处理，3-处理失败)',
  description varchar(255) COMMENT '回执处理结果描述',
  
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS company;

-- 与广州国际贸易单一窗口对接的企业
create table company(
    id int(10) AUTO_INCREMENT COMMENT 'pk',
    gzeport_code varchar(18) COMMENT '电子口岸备案号（企业单一窗口企业注册编号）',
    name varchar(100) COMMENT '企业海关备案名称',
--    http_api_key varchar(18) COMMENT '接口调用秘钥',
    edi_code varchar(18) COMMENT 'EDI账号（sender）',
    dxp_id varchar(18) COMMENT '数据交换（传输）编号',
    
    cus_code varchar(18) COMMENT '海关备案号',
    ciq_code varchar(10) COMMENT '检验检疫备案号',
    
    internet_domain_name varchar(100) COMMENT '企业网址',

    contact varchar(30) COMMENT '联系人',
    telephone varchar(50) COMMENT '联系电话',
    address varchar(255) COMMENT '联系地址',
    emain varchar(255) COMMENT '联系人邮箱',
    note varchar(255) COMMENT '备注',
    
--    key_path varchar(255) COMMENT 'http接口调用证书路径',

    create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
    create_user_id int(10) COMMENT '数据录入用户ID',
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
    update_user_id int(10) COMMENT '操作用户ID',
    
    PRIMARY KEY (id),
    unique(gzeport_code)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table http_account(
	id int(10) AUTO_INCREMENT COMMENT 'pk',
	company_id int(10) NOT NULL COMMENT '所属企业id',
	http_url varchar(255) COMMENT 'http接口地址',
	http_api_key varchar(18) COMMENT '接口调用秘钥',
	certificate_code varchar(18) COMMENT '企业证书编号',
	http_key_path varchar(255) COMMENT 'http接口调用证书路径',
	
	create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
    create_user_id int(10) COMMENT '数据录入用户ID',
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
    update_user_id int(10) COMMENT '操作用户ID',
	
	PRIMARY KEY (id),
	unique(company_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table ftp_account(
	id int(10) AUTO_INCREMENT COMMENT 'pk',
	company_id int(10) NOT NULL COMMENT '所属企业id',
	ftp_url varchar(255) COMMENT 'ftp服务器ip地址',
	ftp_port int(10) COMMENT 'ftp服务端口号',
	ftp_user varchar(32) COMMENT 'ftp账户',
	ftp_password varchar(64) COMMENT 'ftp账户密码',
	
	create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
    create_user_id int(10) COMMENT '数据录入用户ID',
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
    update_user_id int(10) COMMENT '操作用户ID',
    
    PRIMARY KEY (id),
	unique(company_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--create table mq_account(
--
--)


DROP table if  EXISTS qualification;

-- 企业角色(类型)
create table qualification(
  id int(10) AUTO_INCREMENT COMMENT 'pk',
  name varchar(32) COMMENT '企业角色（类型）名称',
  `type` varchar(8) COMMENT '企业类型代码',
  `desc` varchar(1000) COMMENT '角色描述',
  
  PRIMARY KEY (id),
  unique(name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS company_qualification;

-- 企业与企业角色中间表
create table company_qualification(
  cid int(10) NOT NULL COMMENT '企业ID',
  qid int(10) NOT NULL COMMENT '企业角色（类型）ID'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS module;

-- 系统模块表
create table module(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  p_id int(10) COMMENT '父节点（菜单）id',
  en_code varchar(64) COMMENT '英文名称',
  name varchar(255) COMMENT '权限（资源）名称',
  icon varchar(255) COMMENT '小图标属性',
  target varchar(64) COMMENT '节点属性',
  is_menu tinyint(1) COMMENT '菜单or功能',
  is_public tinyint(1) COMMENT '是否是公共权限（资源）',
  sort_code tinyint(3) COMMENT '排序',
  url varchar(255) COMMENT 'url链接地址',
  enable_mark tinyint(1) COMMENT '是否可用（0-禁用，1-可用）',
  function_code varchar(10) COMMENT '业务逻辑标识（I-进口，O-出口，IO-进出口）',
  
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS qualification_module;

-- 企业角色与系统模块对应中间表
create table qualification_module(
  qid int(10) NOT NULL COMMENT '企业角色（类型）ID',
  mid int(10) NOT NULL COMMENT '系统模块ID'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS permission;

-- 用户操作权限表
create table permission(
  id int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  p_id int(10) COMMENT '父节点（菜单）id',
  name varchar(255) COMMENT '权限（资源）名称',
  is_menu tinyint(1) COMMENT '菜单or功能',
  is_public tinyint(1) COMMENT '是否是公共权限（资源）',
  sort_code tinyint(3) COMMENT '排序',
  url varchar(255) COMMENT 'url链接地址',
  enable_mark tinyint(1) COMMENT '是否可用（0-禁用，1-可用）',
  
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS role;

-- 角色表
CREATE TABLE `role` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `name` varchar(32) DEFAULT NULL COMMENT '角色名称',
  `desc` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `type` varchar(10) DEFAULT NULL COMMENT '角色类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

DROP table if  EXISTS role_permission;

-- 角色-权限对应表
CREATE TABLE `role_permission` (
  `rid` int(10) DEFAULT NULL COMMENT '角色ID',
  `pid` int(10) DEFAULT NULL COMMENT '权限ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS user;

-- 用户表
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'pk',
  `nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `name` varchar(64) NOT NULL COMMENT '登录账号（名称）',
  `email` varchar(128) DEFAULT NULL COMMENT '用户邮箱',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `company_id` int(10) COMMENT '账户所属企业',
  `last_login_time` timestamp  COMMENT '最后登录时间',
  `status` tinyint(2) DEFAULT '1' COMMENT '1:有效，0:禁止登录',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  
    create_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据入库时间',
    create_user_id int(10) COMMENT '数据录入用户ID',
    update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近操作时间',
    update_user_id int(10) COMMENT '操作用户ID',
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

DROP table if  EXISTS user_role;

-- 用户-角色映射表
CREATE TABLE `user_role` (
  `uid` int(10) DEFAULT NULL COMMENT '用户ID',
  `rid` int(10) DEFAULT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP table if  EXISTS system_config;

-- 系统配置
CREATE TABLE `system_config` (
  `k` varchar(20) NOT NULL COMMENT '键',
  `v` varchar(512) DEFAULT NULL COMMENT '值',
  PRIMARY KEY (`k`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

