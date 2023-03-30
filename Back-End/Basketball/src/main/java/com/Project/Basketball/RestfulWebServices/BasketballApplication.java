package com.Project.Basketball.RestfulWebServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class BasketballApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasketballApplication.class, args);
	}

}
