package com.biz.beach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.biz.beach.model.AdminDao;
import com.biz.beach.model.AdminUpdateVO;
import com.biz.beach.model.AdminVO;

@Service
public class AdminService {

	@Autowired
	AdminDao aMapper;
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	public void insertAdmin(AdminVO vo) {
		
		String cryptPass=passEncoder.encode(vo.getAdmin_pass());
		vo.setAdmin_pass(cryptPass);
		
		aMapper.insertAdmin(vo);
		
	}
	
	public boolean chkPass(AdminVO vo) {
		
		List<AdminVO> adminList=aMapper.selectAll();
		
		for(AdminVO v:adminList) {
			if(vo.getAdmin_id().equals(v.getAdmin_id())) {
				return passEncoder.matches(vo.getAdmin_pass(), v.getAdmin_pass());
			}
		}
		
		return false;
	}

	public int adminUpdate(AdminUpdateVO vo) {
		
		AdminVO adminVO=new AdminVO();
		adminVO.setAdmin_id(vo.getAdmin_id());
		adminVO.setAdmin_pass(vo.getAdmin_pass());
		if(this.chkPass(adminVO)) {
			adminVO.setAdmin_pass(passEncoder.encode(vo.getAdmin_newpass()));
		} else {
			return 0;
		}
		
		return aMapper.updateAdmin(adminVO);
	}
}




















