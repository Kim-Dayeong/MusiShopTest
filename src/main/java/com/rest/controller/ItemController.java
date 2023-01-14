package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.domain.ItemVO;
import com.rest.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemservice;
	
	//모든 item 조회
	@GetMapping("")
	public List<ItemVO>getAllItems(){
		return itemservice.getAllItems();
	}

}
