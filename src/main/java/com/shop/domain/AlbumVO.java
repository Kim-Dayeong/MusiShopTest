package com.shop.domain;

import java.util.Date;

public class AlbumVO {
	/*
	 * id varchar(20) PK 
title varchar(50) 
artist varchar(50) 
reldate int(11) 
img varchar(50) 
regdate datetime
	 */
	
	private String id;
	private String title;
	private String artist;
	private int reldate;
	private String img;
	private Date regdate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getReldate() {
		return reldate;
	}
	public void setReldate(int reldate) {
		this.reldate = reldate;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
	
}
