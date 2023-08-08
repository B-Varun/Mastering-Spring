package com.spring.learn.Example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.learn.Example.game.Game;

@Component(value = "runner")
public class GameRunner {

	Game game;

	@Autowired
	public GameRunner(@Qualifier("petris") Game game) {
		System.out.println("\t\t=======Constructor Injection=======");
		this.game = game;
		run();
	}
	
	public void setGame() {
		System.out.println("\t\t---Setter invoked---");
	}
	
	public void run() {
		game.play();
	}
	
	
}
