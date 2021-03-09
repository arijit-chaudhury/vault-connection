package com.arijit.in.vaultconnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.arijit.in.vaultconnection.config.VaultConfiguration;

@SpringBootApplication
public class VaultConnectionApplication {
	
	private static Logger logger = LoggerFactory.getLogger(VaultConnectionApplication.class);

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(VaultConnectionApplication.class, args);
		VaultConfiguration vaultConfiguration = ctx.getBean(VaultConfiguration.class);
		
		logger.info("Login= {}",vaultConfiguration.getLogin());
		logger.info("Password= {}",vaultConfiguration.getPassword());
	}

}
