package com.biz.beach.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.beach.model.BeachDao;
import com.biz.beach.model.BeachVO;
import com.biz.beach.model.MemoVO;

@Service
public class BeachService {

	@Autowired
	BeachDao bMapper;
	
	public List<BeachVO> selectArea(String area){
		
		return bMapper.selectArea(area);
	}
	
	public BeachVO findByName(int b_id){
		
		return bMapper.findByName(b_id);
	}

	public String getDate() {
		
		LocalDate localDate=LocalDate.now();
		String today=localDate.toString();
		
		return today;
	}
	
	public List<BeachVO> selectRecommend() {

		String[] todays=this.getDate().split("-");
		
		int mounth=Integer.valueOf(todays[1]);
		return bMapper.selectRecommend(mounth);
	}
	
	public String hotM() {
		
		String[] today=this.getDate().split("-");
		int hotM=Integer.valueOf(today[1]);
		
		return ""+hotM;
	}
	
	public String[] getMenus() {
		
		return bMapper.getMenus();
	}

	public List<BeachVO> searchBeach(String search) {
		
		search="%"+search+"%";
		
		return bMapper.searchBeach(search);
	}
}








