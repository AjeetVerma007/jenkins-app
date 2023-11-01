package com.lichfl.restapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private static Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/display")
	public String display() {

		return "Hi welome to jenkins";
	}

}
