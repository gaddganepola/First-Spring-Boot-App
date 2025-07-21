package com.springdemo.SpringBootFirstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstDemoApplication.class, args);

		System.out.println("Hello World!");
	}
}
