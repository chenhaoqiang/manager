package com.chq.manager.dao;

import com.chq.manager.model.TdTask;
import com.chq.manager.model.TdTaskKey;

public interface TdTaskMapper {
    int deleteByPrimaryKey(TdTaskKey key);

    int insert(TdTask record);

    int insertSelective(TdTask record);

    TdTask selectByPrimaryKey(TdTaskKey key);

    int updateByPrimaryKeySelective(TdTask record);

    int updateByPrimaryKey(TdTask record);
}