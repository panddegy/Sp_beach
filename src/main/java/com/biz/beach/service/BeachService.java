package com.biz.beach.service;

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
	
	public List<BeachVO> selectAll(){
		
		List<BeachVO> beachList=beachMapper.selectAll();
		
		return beachList;
	}
	
	public BeachVO findByName(long id){
		
		BeachVO beach=beachMapper.findByName(id);
		
		return beach;
	}

	public List<MemoVO> findByMemo(long id) {

		List<MemoVO> memo=beachMapper.findByMemo(id);
		
		return memo;
	}
	
	public int insert(MemoVO vo) {
		
		int ret=beachMapper.insert(vo);
				
		return ret;
	}
}
