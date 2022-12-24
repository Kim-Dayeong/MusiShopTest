package com.shop.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shop.dao.UserDAO;
import com.shop.domain.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	UserDAO dao;
	
	@Override
	public void join(UserVO vo)throws Exception {
		dao.join(vo);
	}

}
