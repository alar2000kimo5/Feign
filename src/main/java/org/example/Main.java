package org.example;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class,args);
	}
}