package com.yunyitg.cesp.core.company.dao;

import java.util.List;
import java.util.Set;

import com.yunyitg.cesp.core.company.entity.Module;

import tk.mybatis.mapper.common.Mapper;

public interface ModuleMapper extends Mapper<Module> {
    
    List<Module> selectByEnableMark(Integer enableMark);
    
    Set<String> listModuleUrlByCompanyId(Integer companyId);
    
    List<Module> listModuleByCompanyId(Integer companyId);
}