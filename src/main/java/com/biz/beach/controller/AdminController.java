package com.biz.beach.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.beach.model.AdminUpdateVO;
import com.biz.beach.model.AdminVO;
import com.biz.beach.service.AdminService;
import com.biz.beach.service.BeachService;
import com.biz.beach.service.MemoService;

@Controller
public class AdminController {
	
	@Autowired
	BeachService bs;
	@Autowired
	MemoService ms;
	@Autowired
	AdminService as;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login(Model model, HttpSession session) {
		
		if(session.getAttribute("LOG")==null) {
			model.addAttribute("BODY", "LOGIN");
			model.addAttribute("MENUTYPE", "USER");
			model.addAttribute("MENU", bs.getMenus());
		} else {
			model.addAttribute("BODY", "ADMIN");
			model.addAttribute("MENUTYPE", "ADMIN");
			model.addAttribute("STATUS", "로그인");
		}
		return "home";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String adminLogin(Model model, HttpSession session, @ModelAttribute AdminVO vo) {
		
		//as.insertAdmin(vo);
		if(as.chkPass(vo)) {
			model.addAttribute("BODY", "ADMIN");
			model.addAttribute("MENUTYPE", "ADMIN");
			model.addAttribute("STATUS", "로그인");
			session.setAttribute("LOG", vo);
		} else {
			model.addAttribute("BODY", "ADMINFAIL");
			model.addAttribute("STATUS", "로그인");
			model.addAttribute("MENUTYPE", "USER");
			model.addAttribute("MENU", bs.getMenus());
		}
		
		return "home";
	}
	
	@RequestMapping(value="system", method=RequestMethod.GET)
	public String systemMag(Model model, HttpSession session) {
		
		model.addAttribute("BODY", "DATA");
		model.addAttribute("MENUTYPE", "ADMIN");
		model.addAttribute("MLIST", ms.selectAll());
		
		return "home";
	}
	
	@RequestMapping(value="delete/{m_id}", method=RequestMethod.GET)
	public String deleteMemo(@PathVariable int m_id, Model model, HttpSession session) {
		
		ms.deleteMemo(m_id);
		
		model.addAttribute("BODY", "DATA");
		model.addAttribute("MENUTYPE", "ADMIN");
		model.addAttribute("MLIST", ms.selectAll());
		
		return "home";
	}
	
	@RequestMapping(value="adminmag", method=RequestMethod.GET)
	public String adminMag(Model model, HttpSession session) {
		
		model.addAttribute("BODY", "ADMINMAG");
		model.addAttribute("MENUTYPE", "ADMIN");
		
		return "home";
	}
	
	@RequestMapping(value="adminmag", method=RequestMethod.POST)
	public String adminUpdate(Model model, HttpSession session, @ModelAttribute AdminUpdateVO vo) {
		
		int ret=as.adminUpdate(vo);
		
		if(ret>0) {
			model.addAttribute("BODY", "ADMIN");
			model.addAttribute("STATUS", "변경");
			model.addAttribute("MENUTYPE", "ADMIN");
		} else {
			model.addAttribute("BODY", "ADMINFAIL");
			model.addAttribute("STATUS", "변경");
			model.addAttribute("MENUTYPE", "ADMIN");
		}
		
		return "home";
	}
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String adminLogout(Model model, HttpSession session) {
		
		session.setAttribute("LOG", null);
		session.removeAttribute("LOG");
		
		return "redirect:/" ;
	}
	
}


























