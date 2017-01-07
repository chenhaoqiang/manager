package com.chq.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chq.manager.model.AmAccount;
import com.chq.manager.service.AccountService;

/**
 * @author chq
 * @description 主页控制器
 * @date 2016-5-1
 */
@Controller
public class IndexController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/")
	public String index(@RequestParam(value="accNum",required=false)Integer accNum, Model model) {
		AmAccount amAccount = accountService.getAccount(1);
		model.addAttribute("account", amAccount);
		return "index";
	}
}
