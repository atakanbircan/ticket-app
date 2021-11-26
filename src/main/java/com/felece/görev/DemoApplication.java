package com.felece.görev;

import com.felece.görev.repository.BiletRepository;
import com.felece.görev.service.BiletService;
import com.felece.görev.service.impl.BiletServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
