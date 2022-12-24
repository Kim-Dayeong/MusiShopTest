package com.shop.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.shop.domain.UserVO;

public class UserDAOImpl implements UserDAO {
	
	@Inject 
	SqlSession sql;
	
	private static String namespace = "com.shop.mappers.user";
	
	@Override
	public void join(UserVO vo)throws Exception {
		sql.insert(namespace + ".join", vo);
	}
	

}
