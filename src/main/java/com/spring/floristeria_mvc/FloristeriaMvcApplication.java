package com.spring.floristeria_mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com/spring/floristeria_mvc/controladores", "com/spring/floristeria_mvc/repositorios", "com/spring/floristeria_mvc/entidades"})
public class FloristeriaMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FloristeriaMvcApplication.class, args);
	}

}
