package com.spring.learn.Example.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class IGI implements Game{
 public void play() {
	 System.out.println("Playing Project IGI");
 }
 
 public String toString() {
	 return "Project IGI";
 }
}