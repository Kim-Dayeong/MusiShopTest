package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.ItemDao;
import com.rest.domain.ItemVO;

@Service
public class ItemService {
	
	@Autowired
	ItemDao itemDao;
	
	//모든 아이템 
	public List<ItemVO> getAllItems(){
		return itemDao.getAllItems();
	}

}
