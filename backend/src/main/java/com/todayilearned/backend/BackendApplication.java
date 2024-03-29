package com.todayilearned.backend;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/facts")
public class BackendApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
}
