package com.shop.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.domain.ItemVO;
import com.shop.service.ItemService;

@Controller
@RequestMapping("/shop/*")
public class ItemController {
	//ItemList.jsp - ItemController 
	
	@Inject
	ItemService service;
	
	//아이템 목록
	@RequestMapping(value="/ItemList", method=RequestMethod.GET)
	public void getList(Model model)throws Exception {
		List<ItemVO> list = null;
		list = service.list();
		
		model.addAttribute("list",list);
		
	}
	
	//아이템 작성 get 
	@RequestMapping(value="/ItemWrite", method = RequestMethod.GET)
	public void getWrite() throws Exception {
		
	}
	
	//아이템 작성 post
	@RequestMapping(value = "/ItemWrite", method = RequestMethod.POST)
	public String postWrite(ItemVO vo) throws Exception {
		service.write(vo);
		
		return "redirect:/shop/ItemList";
		
	}
	
	//아이템 조회
	@RequestMapping(value = "/ItemView", method = RequestMethod.GET)
	public void getView(@RequestParam("temId") int temId, Model model) throws Exception {
		ItemVO vo = service.view(temId);
		
		model.addAttribute("view", vo);
	}


	//아이템 목록(페이징 구현)
	@RequestMapping(value="/ItemListPage", method=RequestMethod.GET)
	public void getListPage(Model model ,@RequestParam("num")int num)throws Exception {
		
		// 게시물 총 갯수
				int count = service.count();
				
				// 한 페이지에 출력할 게시물 갯수
				int itemNum = 10;
				
				// 하단 페이징 번호 ([ 게시물 총 갯수 ÷ 한 페이지에 출력할 갯수 ]의 올림)
				int pageNum = (int)Math.ceil((double)count/itemNum);
				
				// 출력할 게시물
				int displayItem = (num - 1) * itemNum;
						
				List<ItemVO> list = null; 
				list = service.listPage(displayItem, itemNum);
				model.addAttribute("list", list);		 
				model.addAttribute("pageNum", pageNum);
		
	}

}
	



