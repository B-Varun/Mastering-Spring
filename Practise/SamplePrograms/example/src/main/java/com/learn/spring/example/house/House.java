package com.learn.spring.example.house;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class House {
	
	public House() {
		System.out.println("-----House constructed. Ready for registration-------");
	}

	public void registerHouse() {
		System.out.println("House registered to a person. Welcome!!!");
	}
}
