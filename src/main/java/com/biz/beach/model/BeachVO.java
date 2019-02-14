package com.biz.beach.model;

public class BeachVO {

    private int b_id, hotm;
    private String title, subtitle, topic, area, addr, tel, homepage, mapurl, imgurl;
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public int getHotm() {
		return hotm;
	}
	public void setHotm(int hotm) {
		this.hotm = hotm;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getMapurl() {
		return mapurl;
	}
	public void setMapurl(String mapurl) {
		this.mapurl = mapurl;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	@Override
	public String toString() {
		return "BeachVO [b_id=" + b_id + ", hotm=" + hotm + ", title=" + title + ", subtitle=" + subtitle + ", topic="
				+ topic + ", area=" + area + ", addr=" + addr + ", tel=" + tel + ", homepage=" + homepage + ", mapurl="
				+ mapurl + ", imgurl=" + imgurl + "]";
	}
	public BeachVO(int b_id, int hotm, String title, String subtitle, String topic, String area, String addr,
			String tel, String homepage, String mapurl, String imgurl) {
		super();
		this.b_id = b_id;
		this.hotm = hotm;
		this.title = title;
		this.subtitle = subtitle;
		this.topic = topic;
		this.area = area;
		this.addr = addr;
		this.tel = tel;
		this.homepage = homepage;
		this.mapurl = mapurl;
		this.imgurl = imgurl;
	}
	public BeachVO() {
		super();
	}
    
    
}
