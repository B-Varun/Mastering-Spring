package com.learn.lazy.lazyInitialization.result;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Bread {

	public Bread() {
		System.out.println("Bread prepared.");
	}
}
