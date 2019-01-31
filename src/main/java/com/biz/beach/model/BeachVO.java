package com.biz.beach.model;

public class BeachVO {

	private String b_name;
	private String b_explain;
	private String b_addr;
	private String b_tel;
	private String b_homepage;
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_explain() {
		return b_explain;
	}
	public void setB_explain(String b_explain) {
		this.b_explain = b_explain;
	}
	public String getB_addr() {
		return b_addr;
	}
	public void setB_addr(String b_addr) {
		this.b_addr = b_addr;
	}
	public String getB_tel() {
		return b_tel;
	}
	public void setB_tel(String b_tel) {
		this.b_tel = b_tel;
	}
	public String getB_homepage() {
		return b_homepage;
	}
	public void setB_homepage(String b_hompage) {
		this.b_homepage = b_hompage;
	}
	@Override
	public String toString() {
		return "BeachVO [b_name=" + b_name + ", b_explain=" + b_explain + ", b_addr=" + b_addr + ", b_tel=" + b_tel
				+ ", b_hompage=" + b_homepage + "]";
	}
	public BeachVO(String b_name, String b_explain, String b_addr, String b_tel, String b_hompage) {
		super();
		this.b_name = b_name;
		this.b_explain = b_explain;
		this.b_addr = b_addr;
		this.b_tel = b_tel;
		this.b_homepage = b_hompage;
	}
	public BeachVO() {
		super();
	}
	
}
