package com.biz.beach.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BeachDao {

	
	@Select(" select * from tbl_beach ")
	public List<BeachVO> selectAll();
	
	
	
}
