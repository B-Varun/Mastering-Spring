package com.learn.beans.construct_destroy.bean;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Worker {

	private Food burger;
	
	public Worker(Food food) {
		burger = food;
		System.out.println("Worker is provided food to live");
	}
	
	@PostConstruct
	public void eat() {
			System.out.println("Burger is delicious. "
					+ "More work can be done if more food is provided");
	}
	
	@PreDestroy
	public void sleep() {
		System.out.println("Tired. Going to bed. Bye!!");
	}
	
	
	
}
