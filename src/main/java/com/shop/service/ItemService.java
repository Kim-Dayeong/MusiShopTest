package com.shop.service;

import java.util.List;

import com.shop.domain.ItemVO;

public interface ItemService {
	
	//아이템 목록 
	public List<ItemVO> list() throws Exception;

	//아이템 작성 
	public void write(ItemVO vo) throws Exception;

	//아이템 조회
	public ItemVO view(int temId) throws Exception;
	
	//아이템 총 갯수 
	public int count() throws Exception;
}
