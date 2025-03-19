package com.example.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	// private MarioGame game;
	// private SuperContraGame game;
	private GamingConsole game;

	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
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
