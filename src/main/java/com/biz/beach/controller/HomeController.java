package com.biz.beach.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.beach.model.BeachVO;
import com.biz.beach.service.BeachService;

@Controller
public class HomeController {
	
	@Autowired
	BeachService beachService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
	@RequestMapping("main")
	public String main() {
		
		return "main";
	}
	
	@RequestMapping("sub")
	public String sub(Model model) {
		
		List<BeachVO> beachList=beachService.selectAll();
		model.addAttribute("BLIST", beachList);
		
		return "sub";
	}
}










