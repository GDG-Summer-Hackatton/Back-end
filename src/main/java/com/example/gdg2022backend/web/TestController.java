package com.example.gdg2022backend.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "테스트")
@RestController
public class TestController {

	@Operation(summary = "hello test")
	@GetMapping("/test/hello")
	public String testController() {
		return "hello";
	}
}
