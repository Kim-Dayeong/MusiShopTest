package com.shop.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shop.domain.UserVO;
import com.shop.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Inject
	UserService service;
	
	//회원가입 get
	@RequestMapping(value = "/UserJoin", method = RequestMethod.GET)
	public void getJoin() throws Exception {
		logger.info("get join");
	}
	
	//회원가입 post
	@RequestMapping(value = "/UserJoin", method = RequestMethod.POST)
	public String postJoin(UserVO vo) throws Exception {
		logger.info("post join");
		
		service.join(vo);
		
		return "redirect:/";	
	}
	
	//로그인 get
//	@RequestMapping(value = "/UserLogin", method = RequestMethod.GET)
//	public void getLogin() throws Exception {
//		logger.info("get login");
//	}
	
	//로그인 post
	@RequestMapping(value = "/UserLogin", method = RequestMethod.POST)
	public String login(UserVO vo, HttpServletRequest req, RedirectAttributes rttr)throws Exception {
		logger.info("post login");
		
		HttpSession session = req.getSession();
		UserVO login = service.login(vo);
		
		if(login == null) { //로그인 실패 
			session.setAttribute("user", null);
			rttr.addFlashAttribute("uag", false);
		}else { //로그인 성공 
			session.setAttribute("user", login);
			
		}
		return "redirect:/";
	}
	

	//로그아웃 
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		
		session.invalidate();
		
		return "redirect:/";
	}
	

}
