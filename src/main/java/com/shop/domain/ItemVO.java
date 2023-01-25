package com.shop.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ItemVO {
	/*
	 * 
	 * temId varchar(50) PK 
temName varchar(50) 
temPrice int(11) 
temUserId varchar(50) 
temStock int(11) 
temText varchar(500) 
temImg varchar(2



id int(11) PK 
selid varchar(50) 
title varchar(50) 
cdtitle varchar(50) 
cdid varchar(20) 
setlist int(11) 
price decimal(10,0) 
cdimg varchar(50) 
detail varchar(50) 
regdate datetime
	 */
	
	private int id;
	private String selid;
	private String title;
	private String cdtitle;
	private String cdid;
	private int setlist;
	private BigDecimal price;
	private String cdimg;
	private String detail;
	private Date regdate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSelid() {
		return selid;
	}
	public void setSelid(String selid) {
		this.selid = selid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCdtitle() {
		return cdtitle;
	}
	public void setCdtitle(String cdtitle) {
		this.cdtitle = cdtitle;
	}
	public String getCdid() {
		return cdid;
	}
	public void setCdid(String cdid) {
		this.cdid = cdid;
	}
	public int getSetlist() {
		return setlist;
	}
	public void setSetlist(int setlist) {
		this.setlist = setlist;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCdimg() {
		return cdimg;
	}
	public void setCdimg(String cdimg) {
		this.cdimg = cdimg;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	

	

}
