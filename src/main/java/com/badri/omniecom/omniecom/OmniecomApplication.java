package com.badri.omniecom.omniecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@Configuration
@EnableJpaRepositories(basePackages = "com.badri.omniecom.omniecom.repository")
@SpringBootApplication
@ComponentScan(basePackages = "com.badri.omniecom.omniecom")
public class OmniecomApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OmniecomApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(OmniecomApplication.class, args);
	}
}
