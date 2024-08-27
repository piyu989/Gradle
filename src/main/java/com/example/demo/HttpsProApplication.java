package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HttpsProApplication {
	
	@GetMapping("/home")
	public String home() {
		return "sita ram";
	}

	public static void main(String[] args) {
		SpringApplication.run(HttpsProApplication.class, args);
	}

}
