package com.shop.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.domain.AlbumVO;
import com.shop.domain.ItemVO;
import com.shop.service.AlbumService;
import com.shop.service.ItemService;

@Controller
@RequestMapping("/shop/*")
public class AlbumController {
	
	@Inject
	AlbumService service;
	
	//앨범 목록 
	@RequestMapping(value="/AlbumList", method=RequestMethod.GET)
	public void getList(Model model)throws Exception {
		List<AlbumVO> list = null;
		list = service.list();
		
		model.addAttribute("list",list);
		
	}

}
