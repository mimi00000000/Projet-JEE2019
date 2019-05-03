package org.ReclaimProjectJEE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("org.controllers")
@EntityScan("org.entities")
@EnableAutoConfiguration
@SpringBootApplication
public class ReclaimProjectJeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReclaimProjectJeeApplication.class, args);
	}

}
