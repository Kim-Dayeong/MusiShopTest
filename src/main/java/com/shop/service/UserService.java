package com.shop.service;

import javax.servlet.http.HttpSession;

import com.shop.domain.UserVO;

public interface UserService {
	public void join(UserVO vo)throws Exception;
	
	//로그인 
	public UserVO login(UserVO vo)throws Exception;
}
