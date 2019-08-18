package com.example.logging_exceptions;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
public class LoggingExceptionsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LoggingExceptionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

@RestController	
 class LoggingController {

	Logger logger = LoggerFactory.getLogger(LoggingController.class);

	@RequestMapping("/")
	public String index() {
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");

		return "Howdy! Check out the Logs to see the output...";
	}
}
