package com.example.rentalcarsrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RentalCarsRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalCarsRestApiApplication.class, args);
	}

}
