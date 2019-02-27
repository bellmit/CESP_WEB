package com.yunyitg.cesp.core.company.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yunyitg.cesp.common.dto.BaseResult;
import com.yunyitg.cesp.core.company.dto.CompanyInsertDto;
import com.yunyitg.cesp.core.company.dto.CompanyQueryDto;
import com.yunyitg.cesp.core.company.entity.Company;
import com.yunyitg.cesp.core.company.service.CompanyService;
import com.yunyitg.cesp.core.company.vo.CompanyVo;

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/corp/ent")
public class CompanyController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public BaseResult<Object> add(HttpServletRequest request,@Valid CompanyInsertDto insertDto,
			BindingResult bindingResult) {
		LOG.info("invoke----------/corp/ent/add");
		if(bindingResult.hasErrors()) {
			StringBuffer sb = new StringBuffer();
			for(ObjectError objectError : bindingResult.getAllErrors()){
                sb.append(objectError.getDefaultMessage() + ";");
            }
			return new BaseResult<Object>(false, sb.deleteCharAt(sb.length() - 1).toString());
		}
		return new BaseResult<Object>(true,insertDto);
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public BaseResult<PageInfo<Company>> listEnts(HttpServletRequest request,  CompanyQueryDto queryDto) {
		LOG.info("invoke----------/corp/ent/list");
		PageInfo<Company> page = companyService.listByConditions(queryDto);
		return new BaseResult<PageInfo<Company>>(true, page);
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public BaseResult<CompanyVo> findByGzeportCode(HttpServletRequest request,
			@RequestParam(value="gzeportCode", required=true)String gzeportCode) {
		CompanyVo vo = companyService.findByGzeportCode(gzeportCode);
		return new BaseResult<CompanyVo>(true, vo);
	}
	
//	@RequestMapping(value = "/")
	
}
