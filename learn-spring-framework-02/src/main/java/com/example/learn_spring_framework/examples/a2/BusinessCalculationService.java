package com.example.learn_spring_framework.examples.a2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class BusinessCalculationService {


	private DataService dataService;


	public BusinessCalculationService(DataService dataService) {
		this.dataService = dataService;

	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());


		}

	}

}
