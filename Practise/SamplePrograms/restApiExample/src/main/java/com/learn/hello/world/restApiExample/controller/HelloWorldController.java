package com.learn.hello.world.restApiExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("hello")
	public String hello() {
		System.out.println("Someone pinged hello");
		return "Hello World. Nice to meet you all.";
	}
	
	@RequestMapping("bye")
	public String bye() {
		System.out.println("Received a request for bye");
		return "It was nice meeting you. Hope to see you soon. Bye, Take care";
	}

}
