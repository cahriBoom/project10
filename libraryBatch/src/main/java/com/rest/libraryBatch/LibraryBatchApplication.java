package com.rest.libraryBatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients("com.rest.libraryBatch")
@EnableScheduling
public class LibraryBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryBatchApplication.class, args);
	}

}
