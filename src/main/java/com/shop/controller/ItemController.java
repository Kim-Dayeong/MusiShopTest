package com.shop.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.domain.Criteria;
import com.shop.domain.ItemVO;
import com.shop.domain.PageMaker;
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
	
	//아이템 조회(음악조회)
	@RequestMapping(value = "/ItemView", method = RequestMethod.GET)
	public void getView(@RequestParam("id") int id, Model model) throws Exception {
		ItemVO vo = service.view(id);
		
		model.addAttribute("view", vo);
	}
	
	//아이템 작성 get - 아이템 작성 페이지로 이동 
	@RequestMapping(value="/ItemWrite", method = RequestMethod.GET)
	public void getWrite() throws Exception {
		
	}
	
	//아이템 작성 post - 아이템 작성후 값 전달 생성 
	@RequestMapping(value = "/ItemWrite", method = RequestMethod.POST)
	public String postWrite(ItemVO vo) throws Exception {
		service.write(vo);
		
		return "redirect:/shop/ItemList";
		
	}
	
	//페이징
	@RequestMapping(value = "/listPaging", method = RequestMethod.GET)
	public String listPaging(Model model, Criteria criteria) throws Exception {
		//logger.info("listPaging...");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCriteria(criteria);
		pageMaker.setTotalCount(1000);
		
		model.addAttribute("paging",service.listCriteria(criteria));
		model.addAttribute("pageMaker",pageMaker);
		
		return "/shop/ListPaging";
		
	}
//	

//
//
//	
//	//아이템 목록 , 페이징 , 검색 
//	@RequestMapping(value = "/ItemPageSearch", method = RequestMethod.GET)
//	public void getListPageSearch(Model model, @RequestParam("num")int num,
//			@RequestParam(value = "searchType",required = false, defaultValue = "temName")String searchType,
//			@RequestParam(value = "keyword",required = false, defaultValue = "" )String keyword
//			) throws Exception {
//		
//		ItemPage page = new ItemPage();
//		
//		page.setNum(num);
//		page.setCount(service.count());
//		
//		List<ItemVO> list = null;
//		list = service.listPageSearch(page.getDisplayPost(),page.getPostNum(),searchType, keyword);
//		
//		model.addAttribute("list", list);
//		model.addAttribute("page", page);
//		model.addAttribute("select", num);
//	}

}
	



