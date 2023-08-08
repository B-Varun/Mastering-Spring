package com.spring.learn.Example.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="petris")
public class Tetris implements Game{
	public void play() {
		System.out.println("Playing Tetris Game");
	}
	
	 public String toString() {
		 return "Pocket Tetris";
	 }
}
