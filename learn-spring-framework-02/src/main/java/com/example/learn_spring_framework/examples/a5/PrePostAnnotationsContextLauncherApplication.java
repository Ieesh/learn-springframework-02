package com.example.learn_spring_framework.examples.a5;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {

	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");
	}

	// suppose to initalize a database
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}



}

@Component
class SomeDependency {

	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Some logic using SomeDependency");

	}

	@PreDestroy
	public void cleanup() {
		System.out.println("cleanup");

	}

}

@ComponentScan
@Configuration
public class PrePostAnnotationsContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


		}

	}

}
