package com.shop.service;

import java.util.List;

import com.shop.domain.AlbumVO;


public interface AlbumService {
	
	//앨범 목록 
	public List<AlbumVO> list() throws Exception;

}
