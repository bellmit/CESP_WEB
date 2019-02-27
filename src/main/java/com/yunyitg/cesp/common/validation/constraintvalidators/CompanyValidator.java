package com.yunyitg.cesp.common.validation.constraintvalidators;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.yunyitg.cesp.common.utils.SpringContextUtil;
import com.yunyitg.cesp.common.validation.constraints.Company;
import com.yunyitg.cesp.core.company.service.impl.CompanyManager;


public class CompanyValidator implements ConstraintValidator<Company, String> {
	
	final static CompanyManager companyManager = SpringContextUtil.getBean("companyManager",CompanyManager.class);
	
	private Map<String, com.yunyitg.cesp.core.company.entity.Company> gzeportMapCompany;
	
	private Map<String, com.yunyitg.cesp.core.company.entity.Company> nameMapCompany;
	
	private String property = "gzeportCode";
	
	@Override
	public void initialize(Company constraintAnnotation) {
		gzeportMapCompany = companyManager.getGzeportCodeMapCompany();
		nameMapCompany = companyManager.getNameMapCompany();
		property = constraintAnnotation.property();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if (property.equals("gzeportCode")) {
			if (gzeportMapCompany != null) {
				return gzeportMapCompany.get(value) == null ? false : true;
			}
		} else if (property.equals("name")) {
			if (nameMapCompany != null) {
				return nameMapCompany.get(value) == null ? false : true;
			}
		}
		return false;
	}

}
