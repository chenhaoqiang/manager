package com.chq.manager.dao;

import com.chq.manager.model.ScDictType;

public interface ScDictTypeMapper {
    int deleteByPrimaryKey(Integer typenum);

    int insert(ScDictType record);

    int insertSelective(ScDictType record);

    ScDictType selectByPrimaryKey(Integer typenum);

    int updateByPrimaryKeySelective(ScDictType record);

    int updateByPrimaryKey(ScDictType record);
}