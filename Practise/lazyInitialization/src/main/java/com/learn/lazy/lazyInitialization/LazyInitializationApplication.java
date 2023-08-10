package com.learn.lazy.lazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learn.lazy.lazyInitialization.ingredients.Dough;
import com.learn.lazy.lazyInitialization.result.Bread;

@ComponentScan
public class LazyInitializationApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(LazyInitializationApplication.class);
		
		ctx.getBean(Dough.class);
		ctx.getBean(Bread.class);
		
	}

}
