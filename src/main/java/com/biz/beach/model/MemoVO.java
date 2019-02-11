package com.biz.beach.model;

public class MemoVO {

	private long m_id, m_bid;
	private String m_text;
	public long getM_id() {
		return m_id;
	}
	public void setM_id(long m_id) {
		this.m_id = m_id;
	}
	public long getM_bid() {
		return m_bid;
	}
	public void setM_bid(long m_bid) {
		this.m_bid = m_bid;
	}
	public String getM_text() {
		return m_text;
	}
	public void setM_text(String m_text) {
		this.m_text = m_text;
	}
	@Override
	public String toString() {
		return "MemoVO [m_id=" + m_id + ", m_bid=" + m_bid + ", m_text=" + m_text + "]";
	}
	public MemoVO(long m_id, long m_bid, String m_text) {
		super();
		this.m_id = m_id;
		this.m_bid = m_bid;
		this.m_text = m_text;
	}
	public MemoVO() {
		super();
	}
	
	
}
