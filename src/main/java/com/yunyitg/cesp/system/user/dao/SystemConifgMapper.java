package com.yunyitg.cesp.system.user.dao;

import com.yunyitg.cesp.system.user.entity.SystemConfig;

public interface SystemConifgMapper {
    int deleteByPrimaryKey(String k);

    int insert(SystemConfig record);

    int insertSelective(SystemConfig record);

    SystemConfig selectByPrimaryKey(String k);

    int updateByPrimaryKeySelective(SystemConfig record);

    int updateByPrimaryKey(SystemConfig record);
}