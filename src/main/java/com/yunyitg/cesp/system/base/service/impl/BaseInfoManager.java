package com.yunyitg.cesp.system.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseInfoManager {

	@Autowired
	private BaseCiqOrgInfoService baseCiqOrgInfoService;
	
	@Autowired
	private BaseCountryInfoService baseCountryInfoService;
	
	@Autowired
	private BaseCurrencyInfoService baseCurrencyInfoService;
	
	@Autowired
	private BaseCustomsInfoService baseCustomsInfoService;
	
	@Autowired
	private BasePackageInfoService basePackageInfoService;
	
	@Autowired
	private BasePortInfoService basePortInfoService;
	
	@Autowired
	private BaseProvinceInfoService baseProvinceInfoService;
	
	@Autowired
	private BaseRegulatoryLocationService baseRegulatoryLocationService;
	
	@Autowired
	private BaseRegulatoryPlaceService baseRegulatoryPlaceService;
	
	@Autowired
	private BaseTaxExemptionMethodService baseTaxExemptionMethodService;
	
	@Autowired
	private BaseTradeModeService baseTradeModeService;
	
	@Autowired
	private BaseTransactionModeService baseTransactionModeService;
	
	@Autowired
	private BaseTransportInfoService baseTransportInfoService;
	
	@Autowired
	private BaseUnitInfoService baseUnitInfoService;
	
	/**
	 * 根据检验检疫机构名称【ciqOrgName】 获取 检验检疫机构代码【ciqOrgCode】
	 * @param ciqOrgName
	 * @return
	 */
	public String getCiqOrgCodeByName(String ciqOrgName) {
		return baseCiqOrgInfoService.getNameMapCode().get(ciqOrgName);
	}
	
	/**
	 * 根据检验检疫机构代码【ciqOrgCode】获取检验检疫机构名称【ciqOrgName】
	 * @param ciqOrgCode
	 * @return
	 */
	public String getCiqOrgNameByCode(String ciqOrgCode) {
		return baseCiqOrgInfoService.getCodeMapName().get(ciqOrgCode);
	}
	
	/**
	 * 根据国家名称【countryName】 获取国检代码【countryCode】
	 * @param name
	 * @return
	 */
	public String getCountryCodeByName(String name) {
		return baseCountryInfoService.getNameMapCode().get(name);
	}
	
	/**
	 * 根据国家代码【countryCode】 获取国家名称【countryName】
	 * @param code
	 * @return
	 */
	public String getCountryNameByCode(String code) {
		return baseCountryInfoService.getCodeMapName().get(code);
	}
	
	/**
	 * 根据币制名称【currencyName】获取币制代码【currencyCode】
	 * @param currencyName
	 * @return
	 */
	public String getCurrencyCodeByName(String currencyName) {
		return baseCurrencyInfoService.getNameMapCode().get(currencyName);
	}
	
	/**
	 * 根据币制代码【currencyCode】获取币制名称【currencyName】
	 * @param currencyCode
	 * @return
	 */
	public String getCurrencyNameByCode(String currencyCode) {
		return baseCurrencyInfoService.getCodeMapName().get(currencyCode);
	}
	
	/**
	 * 根据海关关区名称【customsName】获取海关关区代码【customsCode】
	 * @param customsName
	 * @return
	 */
	public String getCustomsCodeByName(String customsName) {
		return baseCustomsInfoService.getNameMapCode().get(customsName);
	}
	
	/**
	 * 根据海关关区代码【customsCode】获取海关关区名称【customsName】
	 * @param customsCode
	 * @return
	 */
	public String getCustomsNameByCode(String customsCode) {
		return baseCustomsInfoService.getCodeMapName().get(customsCode);
	}
	
	/**
	 * 根据包装类型名称【packageName】获取包装类型代码【packageCode】
	 * @param packageName
	 * @return
	 */
	public String getPackageCodeByName(String packageName) {
		return basePackageInfoService.getNameMapCode().get(packageName);
	}
	
	/**
	 * 根据包装类型代码【packageCode】获取包装类型名称【packageName】
	 * @param packageCode
	 * @return
	 */
	public String getPackageNameByCode(String packageCode) {
		return basePackageInfoService.getCodeMapName().get(packageCode);
	}
	
	/**
	 * 根据港口名称【portName】获取港口代码【portCode】
	 * @param portName
	 * @return
	 */
	public String getPortCodeByName(String portName) {
		return basePortInfoService.getNameMapCode().get(portName);
	}
	
	/**
	 * 根据港口代码【portCode】获取港口名称【portName】
	 * @param portCode
	 * @return
	 */
	public String getPortNameByCode(String portCode) {
		return basePortInfoService.getCodeMapName().get(portCode);
	}
	
	/**
	 * 根据行政区域名称【provinceName】获取行政区域代码【provinceCode】
	 * @param provinceName
	 * @return
	 */
	public String getProvinceCodeByName(String provinceName) {
		return baseProvinceInfoService.getNameMapCode().get(provinceName);
	}
	
	/**
	 * 根据行政区域代码【provinceCode】获取行政区域名称【provinceName】
	 * @param provinceCode
	 * @return
	 */
	public String getProvinceNameByCode(String provinceCode) {
		return baseProvinceInfoService.getCodeMapName().get(provinceCode);
	}
	
	/**
	 * 根据监管点名称【regulatoryLocationName】获取监管点代码【regulatoryLocationCode】
	 * @param regulatoryLocationName
	 * @return
	 */
	public String getRegulatoryLocationCodeByName(String regulatoryLocationName) {
		return baseRegulatoryLocationService.getNameMapCode().get(regulatoryLocationName);
	}
	
	/**
	 * 根据监管点代码【regulatoryLocationCode】获取监管点名称【regulatoryLocationName】
	 * @param regulatoryLocationCode
	 * @return
	 */
	public String getRegulatoryLocationNameByCode(String regulatoryLocationCode) {
		return baseRegulatoryLocationService.getCodeMapName().get(regulatoryLocationCode);
	}
	
	/**
	 * 根据监管场所名称【regulatoryPlaceName】获取监管场所代码【regulatoryPlaceCode】
	 * @param regulatoryPlaceName
	 * @return
	 */
	public String getRegulatoryPlaceCodeByName(String regulatoryPlaceName) {
		return baseRegulatoryPlaceService.getNameMapCode().get(regulatoryPlaceName);
	}
	
	/**
	 * 根据监管场所代码【regulatoryPlaceCode】获取监管场所名称【regulatoryPlaceName】
	 * @param regulatoryPlaceCode
	 * @return
	 */
	public String getRegulatoryPlaceNameByCode(String regulatoryPlaceCode) {
		return baseRegulatoryPlaceService.getCodeMapName().get(regulatoryPlaceCode);
	}
 	
	/**
	 * 根据贸易类型名称【tradeModeName】获取贸易类型代码【tradeModeCode】
	 * @param tradeModeName
	 * @return
	 */
	public String getTradeModeCodeByName(String tradeModeName) {
		return  baseTradeModeService.getNameMapCode().get(tradeModeName);
	}
	
	/**
	 * 根据贸易类型代码【tradeModeCode】获取贸易类型名称【tradeModeName】
	 * @param tradeModeCode
	 * @return
	 */
	public String getTradeModeNameByCode(String tradeModeCode) {
		return baseTradeModeService.getCodeMapName().get(tradeModeCode);
	}
	
	/**
	 * 根据成交方式名称【transactionModeName】获取成交方式代码【transactionModeCode】
	 * @param transactionModeName
	 * @return
	 */
	public String getTransactionModeCodeByName(String transactionModeName) {
		return baseTransactionModeService.getNameMapCode().get(transactionModeName);
	}
	
	/**
	 * 根据成交方式代码【transactionModeCode】获取成交方式名称【transactionModeName】
	 * @param transactionModeCode
	 * @return
	 */
	public String getTransactionModeNameByCode(String transactionModeCode) {
		return baseTransactionModeService.getCodeMapName().get(transactionModeCode);
	}
	
	/**
	 * 根据运输方式名称【transportName】获取运输方式代码【transportCode】
	 * @param transportName
	 * @return
	 */
	public String getTransportCodeByName(String transportName) {
		return baseTransportInfoService.getNameMapCode().get(transportName);
	}
	
	/**
	 * 根据运输方式代码【transportCode】获取运输方式名称【transportName】
	 * @param transportCode
	 * @return
	 */
	public String getTransportNameByCode(String transportCode) {
		return baseTransportInfoService.getCodeMapName().get(transportCode);
	}

	/**
	 * 根据计量单位代码【unitCode】获取计量单位名称【unitName】
	 * @param unitCode
	 * @return
	 */
	public String getUnitNameByCode(String unitCode) {
		return baseUnitInfoService.getCodeMapName().get(unitCode);
	}
	
	/**
	 * 根据计量单位名称【unitName】获取计量单位代码【unitCode】
	 * @param unitName
	 * @return
	 */
	public String getUnitCodeByName(String unitName) {
		return baseUnitInfoService.getNameMapCode().get(unitName);
	}
}
