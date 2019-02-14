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
	BeachDao beachMapper;
	
	public List<BeachVO> selectArea(String area){
		
		List<BeachVO> beachList=beachMapper.selectArea(area);
		
		return beachList;
	}
	
	public BeachVO findByName(int b_id){
		
		BeachVO beach=beachMapper.findByName(b_id);
		
		return beach;
	}

	public List<MemoVO> findByMemo(int b_id) {

		List<MemoVO> memo=beachMapper.findByMemo(b_id);
		
		return memo;
	}
	
	public int insert(MemoVO vo) {
		
		LocalDate localDate=LocalDate.now();
		String today=localDate.toString();
		vo.setM_date(today);
		int ret=beachMapper.insert(vo);
				
		return ret;
	}
	
	public List<MemoVO> selectRecentMemo(){
		
		List<MemoVO> memoList=beachMapper.selectRecentMemo();
		List<MemoVO> recentList=new ArrayList<MemoVO>();
		
		int size=7;
		if(size>memoList.size()) size=memoList.size();
		for(int i=0; i<size; i++) {
			MemoVO vo=memoList.get(i);
			recentList.add(vo);
		}
		
		return recentList;
	}

	public List<BeachVO> selectRecommend() {
		LocalDate localDate=LocalDate.now();
		String today=localDate.toString();
		String todays[]=today.split("-");
		
		int mounth=Integer.valueOf(todays[1]);
		List<BeachVO> reList=beachMapper.selectRecommend(mounth);
		List<BeachVO> recommendList=new ArrayList<BeachVO>();
		
		int size=5;
		if(size>reList.size()) size=reList.size();
		for(int i=0; i<size; i++) {
			BeachVO vo=reList.get(i);
			recommendList.add(vo);
		}
		
		return recommendList;
	}
}








