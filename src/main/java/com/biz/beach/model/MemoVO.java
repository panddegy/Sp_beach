package com.biz.beach.model;

public class MemoVO {

	private int m_id, b_id;
	private String m_auth, m_date, m_memo, b_title;
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getM_auth() {
		return m_auth;
	}
	public void setM_auth(String m_auth) {
		this.m_auth = m_auth;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getM_memo() {
		return m_memo;
	}
	public void setM_memo(String m_memo) {
		this.m_memo = m_memo;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	@Override
	public String toString() {
		return "MemoVO [m_id=" + m_id + ", b_id=" + b_id + ", m_auth=" + m_auth + ", m_date=" + m_date + ", m_memo="
				+ m_memo + ", b_title=" + b_title + "]";
	}
	public MemoVO(int m_id, int b_id, String m_auth, String m_date, String m_memo, String b_title) {
		super();
		this.m_id = m_id;
		this.b_id = b_id;
		this.m_auth = m_auth;
		this.m_date = m_date;
		this.m_memo = m_memo;
		this.b_title = b_title;
	}
	public MemoVO() {
		super();
	}
	
	
	
	
}
