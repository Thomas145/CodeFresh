package com.demo.codefresh.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DemoEndpoint {

	public DemoEndpoint() {}

	@RequestMapping("/")
	public String index() {
		return "indexTest";
	}
	
}
