package com.biz.beach.controller;

import java.util.List;
import java.util.Locale;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.beach.model.BeachVO;
import com.biz.beach.model.MemoVO;
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
	public String main(Model model) {
		
		List<MemoVO> recentList=beachService.selectRecentMemo();
		List<BeachVO> recommendBeach=beachService.selectRecommend();
		model.addAttribute("RECENTLIST", recentList);
		model.addAttribute("RECOMMENDLIST", recommendBeach);
		
		return "main";
	}
	
	@RequestMapping(value="sub", method=RequestMethod.GET)
	public String sub(@Param("area") String area, Model model) {
		
		List<BeachVO> beachList=beachService.selectArea(area);
		model.addAttribute("BLIST", beachList);
		
		return "sub";
	}
	
	@RequestMapping(value="ex", method=RequestMethod.GET)
	public String ex(@Param("b_id") int b_id, Model model) {
		
		BeachVO beach=beachService.findByName(b_id);
		List<MemoVO> memo=beachService.findByMemo(b_id);
		model.addAttribute("BEACH", beach);
		model.addAttribute("MEMO", memo);
		
		return "ex";
	}
	@RequestMapping(value="write", method=RequestMethod.POST)
	public String write(@ModelAttribute MemoVO vo) {
		
		int ret=beachService.insert(vo);
		
		return "redirect:/";
	}
}










