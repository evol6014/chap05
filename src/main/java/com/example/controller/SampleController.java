package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {
	
	@GetMapping("/thymeleaf")
	public String thymeleaf() {
		log.info("/thymeleaf 호출됨");
		
		
		return "thymeleaf/hello";
	}
	
	@GetMapping("/jsp")
	public String jsp() {
		log.info("/jsp 호출됨");
		
		return "jsp/hello";
	}

}
