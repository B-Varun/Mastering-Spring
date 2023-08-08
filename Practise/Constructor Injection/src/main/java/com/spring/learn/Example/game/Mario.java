package com.spring.learn.Example.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Mario implements Game{

	public void play() {
		System.out.println("Playing Mario Game");
	}
	
	 public String toString() {
		 return "Super Mario";
	 }
}
