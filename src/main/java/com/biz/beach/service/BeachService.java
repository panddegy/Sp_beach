package com.biz.beach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.beach.model.BeachDao;
import com.biz.beach.model.BeachVO;

@Service
public class BeachService {

	@Autowired
	BeachDao beachMapper;
	
	public List<BeachVO> selectAll(){
		
		List<BeachVO> beachList=beachMapper.selectAll();
		
		return beachList;
	}
	
	
}
