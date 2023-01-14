package com.rest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rest.domain.ItemVO;

@Repository
public class ItemDao {
	
	public static List<ItemVO> item;
	
	//모든 item 조회
	public List<ItemVO> getAllItems(){
		return item;
	}
	
}
