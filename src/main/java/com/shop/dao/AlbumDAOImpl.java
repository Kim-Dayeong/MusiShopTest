package com.shop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shop.domain.AlbumVO;

@Repository
public class AlbumDAOImpl implements AlbumDAO{
	
	@Inject
	SqlSession sql;
	
	private static String namespace = "com.shop.mappers.album";
	
	//앨범 목록 
	@Override
		public List<AlbumVO> list() throws Exception{
			
		return sql.selectList(namespace + ".list");
			
		}

}
