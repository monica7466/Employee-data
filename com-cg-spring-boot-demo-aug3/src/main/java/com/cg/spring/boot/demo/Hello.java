package com.cg.spring.boot.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jdk.internal.org.jline.utils.Log;

@RestController
public class Hello {
	public static final Logger LOG = LoggerFactory.getLogger(Hello.class);

	@GetMapping("/hello")
	public String hello() {
		LOG.info("hello");
		return "Hello world!";
	}

	@PostMapping("/hi")
	public String hi(@RequestBody String myName) {
		LOG.info("Hi" + myName);
		return "Hi" + myName;
	}

}