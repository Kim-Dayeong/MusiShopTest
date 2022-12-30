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

	//아이템 목록
		@RequestMapping(value="/ItemListPage", method=RequestMethod.GET)
		public void getListPage(Model model, @RequestParam("num")int num)throws Exception {
//			List<ItemVO> list = null;
//			list = service.list();
//			
//			model.addAttribute("list",list);
			
			 // 게시물 총 갯수
			 int count = service.count();
			  
			 // 한 페이지에 출력할 게시물 갯수
			 int postNum = 10;
			  
			 // 하단 페이징 번호 ([ 게시물 총 갯수 ÷ 한 페이지에 출력할 갯수 ]의 올림)
			 int pageNum = (int)Math.ceil((double)count/postNum);
			  
			 // 출력할 게시물
			 int displayPost = (num - 1) * postNum;
			 
			 
			// 한번에 표시할 페이징 번호의 갯수
			 int pageNum_cnt = 10;

			 // 표시되는 페이지 번호 중 마지막 번호
			 int endPageNum = (int)(Math.ceil((double)num / (double)pageNum_cnt) * pageNum_cnt);

			 // 표시되는 페이지 번호 중 첫번째 번호
			 int startPageNum = endPageNum - (pageNum_cnt - 1);
			 
			// 마지막 번호 재계산
			 int endPageNum_tmp = (int)(Math.ceil((double)count / (double)pageNum_cnt));
			  
			 if(endPageNum > endPageNum_tmp) {
			  endPageNum = endPageNum_tmp;
			 }
			 
			 boolean prev = startPageNum == 1 ? false : true;
			 boolean next = endPageNum * pageNum_cnt >= count ? false : true;
			 
			// 시작 및 끝 번호
			 model.addAttribute("startPageNum", startPageNum);
			 model.addAttribute("endPageNum", endPageNum);

			 // 이전 및 다음 
			 model.addAttribute("prev", prev);
			 model.addAttribute("next", next);
			 
			 
			// 현재 페이지
			 model.addAttribute("select", num);
			    
			 List list = null; 
			 list = service.listPage(displayPost, postNum);
			 model.addAttribute("list", list);   
			 model.addAttribute("pageNum", pageNum);
			
			 
			 
		}

		
	

}
	



