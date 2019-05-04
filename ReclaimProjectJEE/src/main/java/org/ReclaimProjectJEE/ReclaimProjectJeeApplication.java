package org.ReclaimProjectJEE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({"org.controllers","org.RestServices", "org.Metier"})
@EntityScan("org.entities")
@EnableJpaRepositories("org.dao")
@EnableAutoConfiguration
@SpringBootApplication
public class ReclaimProjectJeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReclaimProjectJeeApplication.class, args);
	}

}