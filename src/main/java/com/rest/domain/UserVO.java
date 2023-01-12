package com.rest.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
	
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
	
	private String userName;
	private String userPass;
	private String userAddr1;
	private String userAddr2;
	private String userAddr3;
	private String userPhon;
	private int verify;
	private Date signDate;
	private int grade;
	
	
	
	
	
	
	
}
