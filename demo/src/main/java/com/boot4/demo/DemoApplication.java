package com.boot4.demo;

import com.boot4.demo.service.ConcurrentInsertTicketStoredProcService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));
		SpringApplication.run(DemoApplication.class, args);
	}

    // Option 1: Run immediately on startup
    /*@Bean
    CommandLineRunner runOnStartup(ConcurrentInsertTicketStoredProcService storedProcService) {
        return args -> {
            System.out.println("Application started - launching concurrent stored procedure calls...");
            storedProcService.executeConcurrentCalls();
        };
    }*/

}
