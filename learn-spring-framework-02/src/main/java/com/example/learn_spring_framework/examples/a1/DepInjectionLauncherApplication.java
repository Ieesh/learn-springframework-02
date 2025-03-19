package com.example.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Component
class BusinessClass {
	// @Autowired
	Dependency1 dependency1;
	// @Autowired
	Dependency2 dependency2;

	@Override
	public String toString() {
		return "dependency 1" + dependency1 + "dependency 2" + dependency2;
	}

	public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("constructor set dependency");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("set dependency 1");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("set dependency 2");
//		this.dependency2 = dependency2;
//	}

}

@ComponentScan
@Configuration
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessClass.class));


		}

	}

}
