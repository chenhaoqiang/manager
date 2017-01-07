package com.chq.manager.dao;

import com.chq.manager.model.ScDict;
import com.chq.manager.model.ScDictKey;

public interface ScDictMapper {
    int deleteByPrimaryKey(ScDictKey key);

    int insert(ScDict record);

    int insertSelective(ScDict record);

    ScDict selectByPrimaryKey(ScDictKey key);

    int updateByPrimaryKeySelective(ScDict record);

    int updateByPrimaryKey(ScDict record);
}