package com.biz.beach.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface BeachDao {

	
	@Select(" select * from tbl_beach ")
	public List<BeachVO> selectAll();
	
	@Select(" select * from tbl_beach where id=#{id} ")
	public BeachVO findByName(long id);
	
	@Select(" select * from tbl_memo where m_bid=#{id} ")
	public List<MemoVO> findByMemo(long id);
	
	@Insert(" insert into tbl_memo values(seq_memo.nextval, #{m_text}, #{m_bid}) ")
	public int insert(MemoVO vo);
}
