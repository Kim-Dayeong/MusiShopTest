package com.shop.dao;

import com.shop.domain.UserVO;

public interface UserDAO {
	


	//회원가입
	public void join(UserVO vo) throws Exception;
	
	//로그인
	public UserVO login(UserVO vo) throws Exception;

}
