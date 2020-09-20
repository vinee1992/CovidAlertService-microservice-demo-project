package com.covidAlert.covidAlertService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CovidAlertServiceApplication {

	@Bean
	RestTemplate restTemplate(RestTemplateBuilder rest) {

		return rest.build();
	}

	public static void main(String[] args) {

		SpringApplication.run(CovidAlertServiceApplication.class, args);
	}

}
