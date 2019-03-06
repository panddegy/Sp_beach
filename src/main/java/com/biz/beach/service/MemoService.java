package com.biz.beach.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.beach.model.MemoDao;
import com.biz.beach.model.MemoVO;

@Service
public class MemoService {

	@Autowired
	MemoDao mMapper;
	
	public List<MemoVO> findByMemo(int b_id) {

		return mMapper.findByMemo(b_id);
	}
	
	public String getDate() {
		
		LocalDate localDate=LocalDate.now();
		String today=localDate.toString();
		
		return today;
	}
	
	public int insert(MemoVO vo) {
		
		vo.setM_date(this.getDate());
		int ret=mMapper.insert(vo);
				
		return ret;
	}
	
	public List<MemoVO> selectRecentMemo(){
		
		return mMapper.selectRecentMemo();
	}

}








