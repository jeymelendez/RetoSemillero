package com.julianamelendez.app_login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.julianamelendez.app_login.repository")

public class AppLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppLoginApplication.class, args);
	}

}
