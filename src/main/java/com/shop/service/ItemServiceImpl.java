package com.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.shop.dao.ItemDAO;
import com.shop.domain.ItemVO;

@Service
public class ItemServiceImpl implements ItemService {

	@Inject
	private ItemDAO dao;
	
	// 아이템 목록
	@Override
	public List<ItemVO> list() throws Exception {
		return dao.list();
		
	}
	// 아이템 작성 
	@Override
	public void write(ItemVO vo) throws Exception{
		dao.write(vo);
	}
	
	//아이템 조회
	@Override
	public ItemVO view(int temId) throws Exception{
		return dao.view(temId);
	}

}
