package com.learn.spring.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learn.spring.example.house.House;
import com.learn.spring.example.office.LeasingOffice;

@ComponentScan
public class ExampleApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ExampleApplication.class);
		
		if(context.getBean(LeasingOffice.class).docsReceived())
			context.getBean(House.class).registerHouse();
		
	}

}
