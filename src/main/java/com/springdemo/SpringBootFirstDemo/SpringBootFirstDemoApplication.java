package com.springdemo.SpringBootFirstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstDemoApplication {

	public static void main(String[] args) {
		Alien obj1;

//		Manually create an object
//		obj1 = new Alien();

//		Use Application Context to create an object
		ApplicationContext context = SpringApplication.run(SpringBootFirstDemoApplication.class, args);

		obj1 = context.getBean(Alien.class);

		obj1.code();

//		Alien obj2 = context.getBean(Alien.class);
//		obj2.code();

//		Direct access to Laptop object
//		Laptop lap = context.getBean(Laptop.class);
//		lap.compile();



	}
}
