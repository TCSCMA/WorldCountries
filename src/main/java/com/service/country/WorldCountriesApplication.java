package com.service.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WorldCountriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldCountriesApplication.class, args);
	}
}
