package com.chq.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chq.manager.dao.AmAccountMapper;
import com.chq.manager.model.AmAccount;
import com.chq.manager.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AmAccountMapper amAccountMapper;

	@Override
	public AmAccount getAccount(Integer accNum) {
		return amAccountMapper.selectByPrimaryKey(accNum);
	}

}
