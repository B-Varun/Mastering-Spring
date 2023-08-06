package com.varun.learnspringframework;

import com.varun.learnspringframework.game.Game;
import com.varun.learnspringframework.game.GameRunner;
import com.varun.learnspringframework.game.Mario;
import com.varun.learnspringframework.game.Tetris;

public class BasicJavaGameApp {

	public static void main(String[] args) {

//		Mario mario = new Mario();
//		Tetris tetris = new Tetris();
//		GameRunner gameRunner = new GameRunner(tetris);
//		GameRunner gameRunner = new GameRunner(mario);
		
//		Game game = new Mario();
//		Game game = new Tetris();

		Game game = new PingBall();
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}