package com.bosonit.BS3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Bs3Application {

	public static void main(String[] args) {
		SpringApplication.run(Bs3Application.class, args);
	}

	@PostConstruct
	public void clasePrincipal() {
		System.out.println("HOLA DESDE CLASE PRINCIPAL");
	}
}
