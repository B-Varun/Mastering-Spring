package com.learn.lazy.lazyInitialization.ingredients;

import org.springframework.stereotype.Component;

@Component
public class Flour {
	
	public Flour() {
		System.out.println("Floor is ready, the next step is to prepare dough");
	}
	
}
