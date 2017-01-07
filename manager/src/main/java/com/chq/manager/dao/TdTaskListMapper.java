package com.chq.manager.dao;

import com.chq.manager.model.TdTaskList;
import com.chq.manager.model.TdTaskListKey;

public interface TdTaskListMapper {
    int deleteByPrimaryKey(TdTaskListKey key);

    int insert(TdTaskList record);

    int insertSelective(TdTaskList record);

    TdTaskList selectByPrimaryKey(TdTaskListKey key);

    int updateByPrimaryKeySelective(TdTaskList record);

    int updateByPrimaryKey(TdTaskList record);
}