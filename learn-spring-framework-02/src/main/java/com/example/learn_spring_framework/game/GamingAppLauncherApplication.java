package com.example.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.example.learn_spring_framework.game")
@Configuration
public class GamingAppLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		// context.getBean(SuperContraGame.class).up();
		}

	}

}
