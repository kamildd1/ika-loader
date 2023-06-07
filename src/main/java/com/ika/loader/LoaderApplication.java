/**
 * This package includes main class application
 */
package com.ika.loader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * This class contains main method in LoaderApplication
 */
@SpringBootApplication
public class LoaderApplication extends SpringBootServletInitializer {
	/**
	 * This method contain Spring Initializer
	 * @param application Parameter containing builder application
	 * @return Configuration for application
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LoaderApplication.class);
	}

	/**
	 * Main method in LoaderApplication
	 * @param args Arguments for method
	 */
	public static void main(String[] args) {
		SpringApplication.run(LoaderApplication.class, args);
	}

}