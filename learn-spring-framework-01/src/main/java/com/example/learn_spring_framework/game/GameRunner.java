package com.example.learn_spring_framework.game;

public class GameRunner {
	// private MarioGame game;
	// private SuperContraGame game;
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println(game);
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
