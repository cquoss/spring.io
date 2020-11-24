package de.quoss.spring.boot.app;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final Logger LOGGER = LogManager.getLogger();

	@Value("${foo:default-value}")
	private String foo;
	
	private static final String TEMPLATE = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") final String name) {
		LOGGER.info("[foo={}]", foo);
		return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
	}
	
}
