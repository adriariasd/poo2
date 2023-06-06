package com.mx.poo2.ingsoft.examen3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.mx.poo2.ingsoft.examen3.modelo")
public class Examen3Application {

	public static void main(String[] args) {
		SpringApplication.run(Examen3Application.class, args);
	}

}
