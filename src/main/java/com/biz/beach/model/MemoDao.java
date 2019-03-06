package com.biz.beach.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface MemoDao {

	@Select(" select * from tbl_memo where b_id=#{b_id} ")
	public List<MemoVO> findByMemo(int b_id);
	
	@Insert(" insert into tbl_memo values(seq_memo.nextval, #{b_id}, #{m_auth}, #{m_date}, #{m_memo}, #{b_title}, #{m_grade} )")
	public int insert(MemoVO vo);
	
	@Select(" select * from tbl_memo order by m_date desc ")
	public List<MemoVO> selectRecentMemo();
	
}
