package com.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.shop.dao.ItemDAO;
import com.shop.domain.Criteria;
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
	
	//아이템 조회
	@Override
	public ItemVO view(int id) throws Exception{
		return dao.view(id);
	}
	// 아이템 작성 
	@Override
	public void write(ItemVO vo) throws Exception{
		dao.write(vo);
	}
	
	//페이징
	@Override
		public List<ItemVO> listCriteria(Criteria criteria)throws Exception{
			return dao.listCriteria(criteria);
		}
	
//	

//	
//	//아이템 총 갯수 
//	@Override
//	public int count() throws Exception{
//		return dao.count();
//	}
//	
//	// 아이템 목록 + 페이징
//	@Override
//	public List listPage(int displayPost, int postNum) throws Exception {
//	 return dao.listPage(displayPost, postNum);
//	}
//	
//	// 아이템 목록 + 페이징 + 검색
//	@Override
//	public List<ItemVO> listPageSearch(
//	  int displayPost, int postNum, String searchType, String keyword) throws Exception {
//	 return  dao.listPageSearch(displayPost, postNum, searchType, keyword);
//	}

}
