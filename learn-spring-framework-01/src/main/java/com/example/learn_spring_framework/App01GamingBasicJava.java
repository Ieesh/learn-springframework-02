package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.PacManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		var mariogame = new MarioGame();
//		var superContragame = new SuperContraGame();

		// var game = new MarioGame();
		// var game = new SuperContraGame();
		var game = new PacManGame(); // dependency for gameRunner class

		// var gameRunner = new GameRunner(mariogame);
		var gameRunner = new GameRunner(game);
		//there is a wired game dependency for gameRunner object always

		gameRunner.run();


	}

}
