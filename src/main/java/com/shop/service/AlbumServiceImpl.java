package com.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shop.dao.AlbumDAO;
import com.shop.dao.ItemDAO;
import com.shop.domain.AlbumVO;

@Service
public class AlbumServiceImpl implements AlbumService{
	
	@Inject
	private AlbumDAO dao;
	
	
	//앨범 목록 
	@Override
	public List<AlbumVO> list() throws Exception{
		return dao.list();
	}

}
