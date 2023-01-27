package com.shop.dao;

import java.util.List;

import com.shop.domain.AlbumVO;


public interface AlbumDAO {
	
	//앨범 목록 
	public List<AlbumVO> list() throws Exception;

}
