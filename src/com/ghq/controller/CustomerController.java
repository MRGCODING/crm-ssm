package com.ghq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ghq.pojo.BaseDict;
import com.ghq.service.BaseDictService;

@Controller
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	
	/**
	 * 显示用户列表
	 * @return
	 */
	@RequestMapping("/")
	public String queryCustomerList() {
		return "customer";
	}

	/**
	 * 显示客户列表
	 * 
	 * @return
	 */
	@RequestMapping("list")
	public String queryCustomerList(Model model) {
		// 客户来源
		List<BaseDict> fromType = this.baseDictService.queryBaseDictByDictTypeCode("002");
		// 所属行业
		List<BaseDict> industryType = this.baseDictService.queryBaseDictByDictTypeCode("001");
		// 客户级别
		List<BaseDict> levelType = this.baseDictService.queryBaseDictByDictTypeCode("006");

		// 把前端页面需要显示的数据放到模型中
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);

		return "customer";
	}


}

