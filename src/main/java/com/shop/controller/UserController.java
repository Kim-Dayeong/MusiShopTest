package com.shop.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.domain.UserVO;
import com.shop.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Inject
	UserService service;
	
	//회원가입 get
	@RequestMapping(value = "/Userjoin", method = RequestMethod.GET)
	public void getJoin() throws Exception {
		logger.info("get join");
	}
	
	//회원가입 post
	@RequestMapping(value = "/Userjoin", method = RequestMethod.POST)
	public String postJoin(UserVO vo) throws Exception {
		logger.info("post join");
		
		service.join(vo);
		
		return null;
	}
	

}
