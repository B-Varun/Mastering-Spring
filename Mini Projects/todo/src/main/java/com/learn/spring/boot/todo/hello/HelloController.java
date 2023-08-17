package com.learn.spring.boot.todo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class HelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hi, Hello. Welcome to the world of Spring";
	}
	
	@RequestMapping("say-hello-jsp")
//	/src/main/resources/META-INF/resources
	public String sayHelloJSP() {
		return "/WEB-INF/jsp/sayHelloJSP.jsp";
	}
	
}
