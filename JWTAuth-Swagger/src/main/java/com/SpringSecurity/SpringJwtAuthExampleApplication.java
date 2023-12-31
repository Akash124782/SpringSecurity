package com.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringJwtAuthExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtAuthExampleApplication.class, args);
		System.out.println("Program Run SuccessFully!");
	}
}
