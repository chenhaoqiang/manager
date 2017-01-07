package com.chq.manager.dao;

import com.chq.manager.model.ScSysConfig;

public interface ScSysConfigMapper {
    int deleteByPrimaryKey(Integer cfgnum);

    int insert(ScSysConfig record);

    int insertSelective(ScSysConfig record);

    ScSysConfig selectByPrimaryKey(Integer cfgnum);

    int updateByPrimaryKeySelective(ScSysConfig record);

    int updateByPrimaryKey(ScSysConfig record);
}