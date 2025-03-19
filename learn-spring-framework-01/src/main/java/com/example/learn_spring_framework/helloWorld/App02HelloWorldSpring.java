package com.example.learn_spring_framework.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learn_spring_framework.helloWorld.HelloWorldConfiguration.Address;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Launch spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// Configure the things that we want spring framework to manage - @configuration

		// retreving beans managed by spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("person4Qualifier"));

		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(s ->
		// System.out.println(s));





	}

}
