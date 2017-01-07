package com.chq.manager.dao;

import com.chq.manager.model.AmAccount;

public interface AmAccountMapper {
    int deleteByPrimaryKey(Integer accnum);

    int insert(AmAccount record);

    int insertSelective(AmAccount record);

    AmAccount selectByPrimaryKey(Integer accnum);

    int updateByPrimaryKeySelective(AmAccount record);

    int updateByPrimaryKey(AmAccount record);
}