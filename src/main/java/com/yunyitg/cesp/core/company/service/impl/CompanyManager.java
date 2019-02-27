package com.yunyitg.cesp.core.company.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.yunyitg.cesp.core.company.dao.CompanyMapper;
import com.yunyitg.cesp.core.company.entity.Company;

@Service("companyManager")
public class CompanyManager {

	@Autowired
	private CompanyMapper companyMapper;
	

	/**
	 * 获取所有企业信息集合(List)
	 * @return
	 */
	@Cacheable(value = "companyCache")
	public List<Company> getAllCompanies() {
		return companyMapper.selectAll();
	}
	
	/**
	 * 获取企业电子口岸备案号对应企业实体集合（Map）
	 * @return
	 */
	public Map<String, Company> getGzeportCodeMapCompany() {
		Map<String,Company> gzeportCodeMapCompany = new HashMap<String,Company>();
		List<Company> list = getAllCompanies();
		for (Company com : list) {
			gzeportCodeMapCompany.put(com.getGzeportCode(), com);
		}
		return gzeportCodeMapCompany;
	}
	
	/**
	 * 获取企业备案名称对应企业实体集合（Map）
	 * @return
	 */
	public Map<String, Company> getNameMapCompany() {
		Map<String,Company> nameMapCompany = new HashMap<String,Company>();
		List<Company> list = getAllCompanies();
		for (Company com : list) {
			nameMapCompany.put(com.getName(), com);
		}
		return nameMapCompany;
	}
	
	/**
	 * 获取企业海关备案号对应企业实体集合（Map）
	 * @return
	 */
	public Map<String, Company> getCusCodeMapCompany() {
		Map<String,Company> cusCodeMapCompany = new HashMap<String,Company>();
		List<Company> list = getAllCompanies();
		for (Company com : list) {
			cusCodeMapCompany.put(com.getCusCode(), com);
		}
		return cusCodeMapCompany;
	}
	
	/**
	 * 获取企业国检备案号对应企业实体集合（Map）
	 * @return
	 */
	public Map<String, Company> getCiqCodeMapCompany() {
		Map<String,Company> ciqCodeMapCompany = new HashMap<String,Company>();
		List<Company> list = getAllCompanies();
		for (Company com : list) {
			ciqCodeMapCompany.put(com.getCiqCode(), com);
		}
		return ciqCodeMapCompany;
	}
	
	/**
	 * 获取企业数据表主键id对应企业实体集合（Map）
	 * @return
	 */
	public Map<Integer, Company> getIdMapCompany() {
		Map<Integer, Company> idMapCompany = new HashMap<Integer, Company>();
		List<Company> list = getAllCompanies();
		for (Company com : list) {
			idMapCompany.put(com.getId(), com);
		}
		return idMapCompany;
	}
	
	/**
	 * 根据企业主键id获取企业电子口岸备案号
	 * @param companyId
	 * @return
	 */
	public String getGzeportCodeById(Integer companyId) {
		Company com = getIdMapCompany().get(companyId);
		if (com != null) {
			return com.getGzeportCode();
		}
		return null;
	}
	
	/**
	 * 通过企业电子口岸备案号获取企业主键id
	 * @param gzeportCode
	 * @return
	 */
	public Integer getCompanyIdByGzeportCode(String gzeportCode) {
		Company com = getGzeportCodeMapCompany().get(gzeportCode);
		if (com != null) {
			return com.getId();
		}
		return null;
	}
	
	/**
	 * 根据企业主键id获取企业备案名称
	 * @param companyId
	 * @return
	 */
	public String getNameById(Integer companyId) {
		Company com = getIdMapCompany().get(companyId);
		if (com != null) {
			return com.getName();
		}
		return null;
	}
	
	/**
	 * 通过企业备案名称获取企业主键id
	 * @param name
	 * @return
	 */
	public Integer getCompanyIdByName(String name) {
		Company com = getNameMapCompany().get(name);
		if (com != null) {
			return com.getId();
		}
		return null;
	} 
	
	/**
	 * 根据企业主键id获取企业海关备案号
	 * @param companyId
	 * @return
	 */
	public String getCusCodeById(Integer companyId) {
		Company com = getIdMapCompany().get(companyId);
		if (com != null) {
			return com.getCusCode();
		}
		return null;
	}
	
	/**
	 * 根据企业主键id获取企业国检备案号
	 * @param companyId
	 * @return
	 */
	public String getCiqCodeById(Integer companyId) {
		Company com = getIdMapCompany().get(companyId);
		if (com != null) {
			return com.getCiqCode();
		}
		return null;
	}
	
	
}
