package com.varun.learnspringframework.game;

public class GameRunner {

	Game game;
	
//	Mario game;
//	Tetris game;
	
//	public GameRunner(Mario g) {
//	public GameRunner(Tetris g) {
	
	public GameRunner(Game g) {
		game = g;
	}
	
	public void run() {
		game.run();
	}
}
