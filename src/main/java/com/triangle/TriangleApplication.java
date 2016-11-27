package com.triangle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Alexander Manko, alexander.eveler@gmail.com
 * @since 27.11.16
 */
@SpringBootApplication
public class TriangleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriangleApplication.class, args);
	}
}
