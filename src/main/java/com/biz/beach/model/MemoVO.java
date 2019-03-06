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
public class MemoVO {

	private int m_id, b_id, m_grade;
	private String m_auth, m_date, m_memo, b_title;
	
}
