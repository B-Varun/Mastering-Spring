package com.spring.learn.Example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.learn.Example")
public class ExampleApplication {
	public static void main(String[] args) {	
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ExampleApplication.class);
	}
}