package com.biz.beach.service;

import java.time.LocalDate;
import java.util.ArrayList;
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
	
	public List<String> selectRecentMemo(){
		
		List<MemoVO> t_List=mMapper.selectRecentMemo();
		List<String> retList = new ArrayList<String>();
		int endNum=10;
		if(t_List.size()<endNum) {
			endNum=t_List.size();
		}
		
		for(int i=0; i<endNum; i++) {
			String rcMemo="<b>"+t_List.get(i).getM_memo()+"</b>&nbsp;&nbsp;-&nbsp;&nbsp;";
			rcMemo+=t_List.get(i).getB_title()+"("+t_List.get(i).getM_date()+")";
			retList.add(rcMemo);
		}
		return retList;
	}
	
	public int[] countMemo() {
		
		List<MemoVO> t_List=mMapper.selectRecentMemo();
		
		int t_ret=t_List.size()-1;
		t_ret=t_ret/10+1;
		int ret[]=new int[t_ret];
		
		for(int i=0; i<t_ret; i++) {
			ret[i]=i+1;
		}
		
		return ret;
	}

	public String getScore(int b_id) {

		return mMapper.getScore(b_id);
	}
	
	public List<MemoVO> getHotB() {
		
		return mMapper.getHotB();
	}
	
	public List<MemoVO> selectAll(){
		
		return mMapper.selectAll();
	}
	
	public int deleteMemo(int m_id) {
		
		return mMapper.deleteMemo(m_id);
	}

	public List<String> selectMemo(int page_id) {
		
		List<MemoVO> t_List=mMapper.selectRecentMemo();
		List<String> retList = new ArrayList<String>();
		
		int startId=(page_id-1)*10;
		int endId=(page_id)*10+1;
		if(t_List.size()<endId) {
			endId=t_List.size();
		}
		
		for(int i=startId; i<endId; i++) {
			String rcMemo="<b>"+t_List.get(i).getM_memo()+"</b>&nbsp;&nbsp;-&nbsp;&nbsp;";
			rcMemo+=t_List.get(i).getB_title()+"("+t_List.get(i).getM_date()+")";
			retList.add(rcMemo);
		}
		return retList;
	}

}








