package com.jpe.bd2Final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class Bd2FinalApplication {

	@RequestMapping("/searchA")
	public String searchA() {
		return "Hello Docker World";
	}

	@RequestMapping("/searchB")
	public String searchB() {
		return "Hello Docker World";
	}

	@RequestMapping("/searchC")
	public String searchC() {
		return "Hello Docker World";
	}

	@RequestMapping("/")
	public String home() {
		return "<h1>Hola, para realizar las busquedas ingresar en /searchA ó /searchB ó /searchC </h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(Bd2FinalApplication.class, args);
	}

}
