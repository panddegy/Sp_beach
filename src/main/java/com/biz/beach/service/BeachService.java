package com.biz.beach.service;

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
	
	@Autowired
	MemoService ms;
	
	public List<BeachVO> selectArea(String area){
		
		return bMapper.selectArea(area);
	}
	
	public BeachVO findByName(int b_id){
		
		return bMapper.findByName(b_id);
	}

	public List<BeachVO> selectRecommend() {

		String[] todays=ms.getDate().split("-");
		
		int mounth=Integer.valueOf(todays[1]);
		return bMapper.selectRecommend(mounth);
	}
	
	public String hotM() {
		
		String[] today=ms.getDate().split("-");
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
	
	public List<BeachVO> getHotB(){
		
		List<BeachVO> hotBList=new ArrayList<BeachVO>();
		
		List<MemoVO> t_List=ms.getHotB();
		
		for(MemoVO v:t_List) {
			BeachVO vo=new BeachVO();
			vo=bMapper.findByName(v.getB_id());
			hotBList.add(vo);
		}
		
		return hotBList;
	}
}








