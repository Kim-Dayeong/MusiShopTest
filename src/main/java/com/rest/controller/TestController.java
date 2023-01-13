package com.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/*") // localhost:0000/test
public class TestController {
	
	//log
//	private final Logger log = LoggerFactory.getLogger(TestController.class);
//	
	@GetMapping("/test")
//	public String test(HttpServletRequest request) {
//		log.info("URL TEST : '{}'",request.getRequestURL());
//		log.info("URI TEST : '{}'",request.getRequestURI()); // 컨트롤러로 들어오는 매핑된 URI 로그
//log.info("JAVA CLASS PATH : '" + this.getClass().getName()+"'"); // 해당 클래스 경로가 어디인지 출력
//		
//		return "root url call";
	public String test() {
		return "test";
	
	}

}
