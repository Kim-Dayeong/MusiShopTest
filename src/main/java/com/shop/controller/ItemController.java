package com.shop.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.domain.ItemPage;
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

	//아이템목록 , 페이징 
	@RequestMapping(value = "/ItemListPage", method = RequestMethod.GET)
	public void getListPage(Model model, @RequestParam("num")int num) throws Exception {
		
		ItemPage page = new ItemPage();
		
		page.setNum(num);
		page.setCount(service.count());
		
		List<ItemVO> list = null;
		list = service.listPage(page.getDisplayPost(), page.getPostNum());
		
		model.addAttribute("list", list);
		model.addAttribute("page", page);

		model.addAttribute("select", num);
	}

	
	//아이템목록 , 페이징 
//	@RequestMapping(value = "/ItemPageSearch", method = RequestMethod.GET)
//	public void getListPaging(Model model, @RequestParam("num")int num) throws Exception {
//		
//		ItemPage page = new ItemPage();
//		
//		page.setNum(num);
//		page.setCount(service.count());
//		
//		List<ItemVO> list = null;
//		list = service.listPage(page.getDisplayPost(), page.getPostNum());
//		
//		model.addAttribute("list", list);
//		model.addAttribute("page", page);
//
//		model.addAttribute("select", num);
//	}
//	
	//아이템 목록 , 페이징 , 검색 
	@RequestMapping(value = "/ItemPageSearch", method = RequestMethod.GET)
	public void getListPageSearch(Model model, @RequestParam("num")int num,
			@RequestParam(value = "searchType",required = false, defaultValue = "temName")String searchType,
			@RequestParam(value = "keyword",required = false, defaultValue = "" )String keyword
			) throws Exception {
		
		ItemPage page = new ItemPage();
		
		page.setNum(num);
		page.setCount(service.count());
		
		List<ItemVO> list = null;
		list = service.listPageSearch(page.getDisplayPost(),page.getPostNum(),searchType, keyword);
		
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("select", num);
	}

}
	



