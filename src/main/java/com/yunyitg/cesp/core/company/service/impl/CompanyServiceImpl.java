package com.yunyitg.cesp.core.company.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunyitg.cesp.common.utils.LoggerUtils;
import com.yunyitg.cesp.core.company.dao.CompanyMapper;
import com.yunyitg.cesp.core.company.dao.CompanyQualificationMapper;
import com.yunyitg.cesp.core.company.dao.FtpAccountMapper;
import com.yunyitg.cesp.core.company.dao.HttpAccountMapper;
import com.yunyitg.cesp.core.company.dao.ModuleMapper;
import com.yunyitg.cesp.core.company.dao.QualificationMapper;
import com.yunyitg.cesp.core.company.dto.CompanyInsertDto;
import com.yunyitg.cesp.core.company.dto.CompanyQueryDto;
import com.yunyitg.cesp.core.company.entity.Company;
import com.yunyitg.cesp.core.company.entity.CompanyQualification;
import com.yunyitg.cesp.core.company.entity.FtpAccount;
import com.yunyitg.cesp.core.company.entity.HttpAccount;
import com.yunyitg.cesp.core.company.entity.Qualification;
import com.yunyitg.cesp.core.company.service.CompanyService;
import com.yunyitg.cesp.core.company.vo.CompanyVo;
import com.yunyitg.cesp.system.shiro.token.manager.TokenManager;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyMapper companyMapper;
	
	@Autowired
	private ModuleMapper moduleMapper;
	
	@Autowired
	private QualificationMapper qualificationMapper;
	
	@Autowired
	private CompanyQualificationMapper companyQualificationMapper;

	@Autowired
	private FtpAccountMapper ftpAccountMapper;
	
	@Autowired
	private HttpAccountMapper httpAccountMapper;
	
	
	
	@Override
	@Transactional
	public boolean create(CompanyInsertDto insertDto) {
		
		Company newCompany = new Company();
		BeanUtils.copyProperties(insertDto, newCompany);
		newCompany.setCreateUserId(TokenManager.getUserId());
		
		Integer companyId = companyMapper.insert(newCompany);
		
//		List<CompanyQualification> companyQualifications = new ArrayList<CompanyQualification>();
		for (Integer dto : insertDto.getQualifications()) {
			CompanyQualification cq = new CompanyQualification();
			cq.setCid(companyId);
			cq.setQid(dto);
			companyQualificationMapper.insert(cq);
		}
		
		return true;
	}

	@Override
	public Set<String> listModulesByCompanyId(Integer companyId) {
		return moduleMapper.listModuleUrlByCompanyId(companyId);
	}



	@Override
	public PageInfo<Company> listByConditions(CompanyQueryDto queryDto) {
		Integer pageNum = queryDto.getPageNum()==null ? 1 : queryDto.getPageNum();
		Integer pageSize = queryDto.getPageSize()==null ? 10 : queryDto.getPageSize();
		PageHelper.startPage(pageNum,pageSize);
		Example example = createExample(queryDto);
		List<Company> companies = companyMapper.selectByExample(example);
		return new PageInfo<Company>(companies);
	}
	
	private Example createExample(CompanyQueryDto dto) {
		Example example = new Example(Company.class);
		Criteria cri = example.createCriteria();
		
		// 企业创建用户ID
		Integer createUserId = TokenManager.getUserId();
		if (createUserId != null) {
			cri.andEqualTo("createUserId", createUserId);
		}
		// 入库时间起始
		if (dto.getStartAt() != null) {
			cri.andGreaterThan("createAt", dto.getStartAt());
		}
		// 入库时间结束
		if (dto.getEndAt() != null) {
			cri.andLessThan("createAt", dto.getEndAt());
		}
		// 企业电子口岸备案号
		if (dto.getGzeportCode() != null && !"".equals(dto.getGzeportCode().trim())) {
			String[] gzeportCodeArray = dto.getGzeportCode().split(",");
			cri.andIn("gzeportCode", Arrays.asList(gzeportCodeArray));
		}
		// 企业海关备案号
		if (dto.getCusCode() != null && !"".equals(dto.getCusCode().trim())) {
			String[] cusCodeArray = dto.getCusCode().split(",");
			cri.andIn("cusCode", Arrays.asList(cusCodeArray));
		}
		// 企业检验检疫备案号
		if (dto.getCiqCode() != null && !"".equals(dto.getCiqCode().trim())) {
			String[] ciqCodeArray = dto.getCiqCode().split(",");
			cri.andIn("ciqCode", Arrays.asList(ciqCodeArray));
		}
		// 企业备案名称
		if (dto.getName() != null && !"".equals(dto.getName().trim())) {
			String[] nameArray = dto.getName().split(",");
			cri.andIn("name", Arrays.asList(nameArray));
		}
		example.orderBy("id").desc();
		return example;
	}



	@Override
	public CompanyVo findByGzeportCode(String gzeportCode) {
		Integer creUserId = TokenManager.getUserId();
		Company company = companyMapper.selectByGzeportCodeAndCreUserId(gzeportCode, creUserId);
		if (company != null) {
			CompanyVo companyVo = new CompanyVo();
			BeanUtils.copyProperties(company, companyVo);
			//获取企业类别集合
			List<Qualification> qualifications = qualificationMapper.listByCompanyId(company.getId());
			companyVo.setQualifications(qualifications);
			//获取企业Http账户
			HttpAccount httpAccount = httpAccountMapper.selectByCompanyId(company.getId());
			companyVo.setHttpAccount(httpAccount);
			//获取企业Ftp账户
			FtpAccount ftpAccount = ftpAccountMapper.selectByCompanyId(company.getId());
			companyVo.setFtpAccount(ftpAccount);
			return companyVo;
		} else {
			return null;
		}
	}


	
}
