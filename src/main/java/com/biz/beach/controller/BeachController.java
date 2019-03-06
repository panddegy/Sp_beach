package com.biz.beach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.beach.model.MemoVO;
import com.biz.beach.service.BeachService;
import com.biz.beach.service.MemoService;

@Controller
public class BeachController {
	
	@Autowired
	BeachService bs;
	@Autowired
	MemoService ms;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("RCLIST", ms.selectRecentMemo());
		model.addAttribute("RELIST", bs.selectRecommend());
		model.addAttribute("HOTM", bs.hotM());
		model.addAttribute("MENU", bs.getMenus());
		model.addAttribute("BODY", "MAIN");
		
		return "home";
	}
	
	@RequestMapping(value="sub/{area}", method=RequestMethod.GET)
	public String sub(@PathVariable String area, Model model) {
		
		model.addAttribute("BLIST", bs.selectArea(area));
		model.addAttribute("MENU", bs.getMenus());
		model.addAttribute("BODY", "SUB");
		
		return "home";
	}
	
	@RequestMapping(value="ex/{b_id}", method=RequestMethod.GET)
	public String ex(@PathVariable int b_id, Model model) {
		
		model.addAttribute("BEACH", bs.findByName(b_id));
		model.addAttribute("MEMO", ms.findByMemo(b_id));
		model.addAttribute("MENU", bs.getMenus());
		model.addAttribute("BODY", "EX");
		
		return "home";
	}
	
	@RequestMapping(value="write", method=RequestMethod.POST)
	public String write(@ModelAttribute MemoVO vo) {
		
		int ret=ms.insert(vo);
		
		return "redirect:/ex/"+vo.getB_id();
	}
	
	@RequestMapping(value="search/{search}", method=RequestMethod.GET)
	public String search(@PathVariable String search, Model model) {
		
		model.addAttribute("BLIST", bs.searchBeach(search));
		model.addAttribute("MENU", bs.getMenus());
		model.addAttribute("BODY", "SUB");
		
		return "home";
	}
}


























