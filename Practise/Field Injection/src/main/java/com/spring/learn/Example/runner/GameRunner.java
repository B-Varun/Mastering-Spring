package com.spring.learn.Example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.learn.Example.game.Game;

@Component(value = "runner")
public class GameRunner {

	@Autowired
	@Qualifier("petris")
	Game game;
	
	public void run() {
		game.play();
	}
	
	
}
