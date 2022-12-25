package com.shop.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shop.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Inject 
	SqlSession sql;
	
	private static String namespace = "com.shop.mappers.user";
	
	//회원가입
	@Override
	public void join(UserVO vo)throws Exception {
		sql.insert(namespace + ".join", vo);
	}
	
	//로그인
	@Override
	public UserVO login(UserVO vo)throws Exception{
		return sql.selectOne(namespace +".login", vo);
	}

}
