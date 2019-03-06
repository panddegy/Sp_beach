package com.biz.beach.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface BeachDao {

	
	@Select(" select * from tbl_main where area=#{area}")
	public List<BeachVO> selectArea(String area);
	
	@Select(" select * from tbl_main where b_id=#{b_id} ")
	public BeachVO findByName(int b_id);
	
	@Select(" select * from tbl_main where hotm=#{mounth} ")
	public List<BeachVO> selectRecommend(int mounth);
	
	@Select(" select area from tbl_main group by area order by area ")
	public String[] getMenus();
	
	@Select(" select * from tbl_main where title like #{search} ")
	public List<BeachVO> searchBeach(String search);
	
}
