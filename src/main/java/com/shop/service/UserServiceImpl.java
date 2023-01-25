package com.shop.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.shop.dao.UserDAO;
import com.shop.dao.UserDAOImpl;
import com.shop.domain.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	UserDAO dao;
	//회원가입 
	@Override
	public void join(UserVO vo)throws Exception {
		dao.join(vo);
	}
	
	//로그인 
	@Override
	public UserVO login(UserVO vo)throws Exception{
		return dao.login(vo);
	}

}
