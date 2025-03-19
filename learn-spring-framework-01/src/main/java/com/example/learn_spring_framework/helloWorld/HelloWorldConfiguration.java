package com.example.learn_spring_framework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {

	record Person(String name, int age, Address address) {
	};

	record Address(String firstLine, String city) {

	};

	@Bean
	public String name() {
		return "ik";
	}

	@Bean
	public int age() {
		return 25;
	}

	@Bean
	public Person person() {
		return new Person("jay", 24, new Address("mansarover", "jaipur"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}

	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
	}

	@Bean(name = "address2")
	@Primary

	public Address address() {
		return new Address("t road", "jaipur");
	}

	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("link road", "jaipur");
	}


}
