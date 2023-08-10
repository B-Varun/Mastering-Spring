package com.learn.lazy.lazyInitialization.ingredients;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Dough {
	
	public Dough() {
		System.out.println("The Dough is ready, the next step is to prepare Bread");
	}
}
