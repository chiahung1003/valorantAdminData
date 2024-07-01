package com.valorant.valorantAdminDataMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.valorant")
@EnableJpaRepositories("com.valorant.dbService.repository")
@EntityScan("com.valorant.dbService.entity")
@SpringBootApplication
public class ValorantAdminDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValorantAdminDataApplication.class, args);
	}

}
