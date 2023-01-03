package com.shop.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shop.domain.ItemVO;

@Repository
public class ItemDAOImpl implements ItemDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.shop.mappers.shop";

	// 아이템 목록 
	@Override
	public List<ItemVO> list() throws Exception {
		
		return sql.selectList(namespace + ".list");

}
	//아이템 작성
	@Override
	public void write(ItemVO vo)throws Exception {
		sql.insert(namespace + ".write", vo);
	}
	
	//아이템 조회
	@Override
	public ItemVO view(int temId) throws Exception{
		
		return sql.selectOne(namespace + ".view", temId);
	}
	
	//아이템 총 갯수
	@Override
	public int count() throws Exception{
		return sql.selectOne(namespace + ".count"); 
	}
	
	// 게시물 목록 + 페이징
	@Override
	public List listPage(int displayPost, int postNum) throws Exception {

	 HashMap data = new HashMap();
	  
	 data.put("displayPost", displayPost);
	 data.put("postNum", postNum);
	  
	 return sql.selectList(namespace + ".listPage", data);
	}
	
	// 아이템 목록 + 페이징 + 검색
	 @Override
	 public List<ItemVO> listPageSearch(
	   int displayPost, int postNum, String searchType, String keyword) throws Exception {

	  HashMap<String, Object> data = new HashMap<String, Object>();
	  
	  data.put("displayPost", displayPost);
	  data.put("postNum", postNum);
	  
	  data.put("searchType", searchType);
	  data.put("keyword", keyword);
	  
	  return sql.selectList(namespace + ".ItemPageSearch", data);
	 }

	
}
