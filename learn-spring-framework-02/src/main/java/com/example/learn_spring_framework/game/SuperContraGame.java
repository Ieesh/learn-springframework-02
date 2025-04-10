package com.example.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("Move UP contra");

	}

	@Override
	public void down() {
		System.out.println("move down contra");
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
