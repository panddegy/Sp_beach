package com.biz.beach.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AdminDao {

	@Select(" select * from tbl_admin ")
	public List<AdminVO> selectAll();
	
	@Insert(" insert into tbl_admin values(#{admin_id}, #{admin_pass}) ")
	public int insertAdmin(AdminVO vo);
	
	@Update(" update tbl_admin set admin_pass=#{admin_pass} where admin_id=#{admin_id} ")
	public int updateAdmin(AdminVO vo);
	
}
