package com.vault.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class PocVaultApplication implements CommandLineRunner {

	Environment env;

	public PocVaultApplication(Environment env) {
		this.env = env;
	}


	public static void main(String[] args) {
		SpringApplication.run(PocVaultApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Logger logger = LoggerFactory.getLogger(PocVaultApplication.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("   username is {}", env.getProperty("username"));
		logger.info("   password is {}", env.getProperty("password"));

		logger.info("----------------------------------------");




	}

}
