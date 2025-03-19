package com.example.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("Move UP pac");

	}

	@Override
	public void down() {
		System.out.println("move down pac");
	}

	@Override
	public void left() {
		System.out.println("move left");
	}

	@Override
	public void right() {
		System.out.println("move right");
	}

}
