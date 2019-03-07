package com.biz.beach.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminUpdateVO {

	private String admin_id, admin_pass, admin_passchk, admin_newpass;
	
}
