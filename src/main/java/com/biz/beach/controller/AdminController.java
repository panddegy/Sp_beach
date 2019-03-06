package com.biz.beach.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.beach.service.BeachService;
import com.biz.beach.service.MemoService;

@Controller
public class AdminController {
	
	@Autowired
	BeachService bs;
	@Autowired
	MemoService ms;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("BODY", "LOGIN");
		model.addAttribute("MENU", bs.getMenus());
		
		return "home";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String adminLogin(Model model, HttpSession session) {
		
		model.addAttribute("BODY", "ADMIN");
		
		return "home";
	}
}


























