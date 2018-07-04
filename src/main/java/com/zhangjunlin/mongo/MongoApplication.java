package com.zhangjunlin.mongo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoApplication implements ApplicationRunner {

	private static final Logger logger = LogManager.getLogger(MongoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args){
		logger.error("Oops! We have an Error. OK");
	}
}
