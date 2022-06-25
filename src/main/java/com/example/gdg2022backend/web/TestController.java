package com.example.gdg2022backend.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test/hello")
	public String testController() {
		return "hello";
	}
}
