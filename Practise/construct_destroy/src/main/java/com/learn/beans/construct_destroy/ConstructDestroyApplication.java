package com.learn.beans.construct_destroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ConstructDestroyApplication {

	public static void main(String[] args) {		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConstructDestroyApplication.class);
		
		System.out.println("Main method started");
		
		System.out.println("Ending main method");
		
	}

}
