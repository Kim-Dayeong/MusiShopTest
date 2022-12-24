package com.shop.domain;

import java.util.Date;

/*
 * userName varchar(50) 
userPass varchar(100) 
userMail varchar(200) 
userAddr1 varchar(50) 
userAddr2 varchar(50) 
userAddr3 varchar(50) 
userPhon varchar(50) 
verify int(11) 
signDate datetime 
grade int(11)
 */

public class UserVO {
	
	private String userName;
	private String userPass;
	private String userMail;
	private String userAddr2;
	private String userAddr3;
	private String userPhon;
	private int verify;
	private Date signDate;
	private int grade;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserAddr2() {
		return userAddr2;
	}
	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}
	public String getUserAddr3() {
		return userAddr3;
	}
	public void setUserAddr3(String userAddr3) {
		this.userAddr3 = userAddr3;
	}
	public String getUserPhon() {
		return userPhon;
	}
	public void setUserPhon(String userPhon) {
		this.userPhon = userPhon;
	}
	public int getVerify() {
		return verify;
	}
	public void setVerify(int verify) {
		this.verify = verify;
	}
	public Date getSignDate() {
		return signDate;
	}
	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
