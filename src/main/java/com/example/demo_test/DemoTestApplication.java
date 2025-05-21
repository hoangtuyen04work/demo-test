package com.example.demo_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.example.demo.service"})
public class DemoTestApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoTestApplication.class, args);
	}

}
