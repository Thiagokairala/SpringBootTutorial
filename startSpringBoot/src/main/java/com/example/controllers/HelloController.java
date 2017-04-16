package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/world", method = RequestMethod.GET)
	public ResponseEntity<String> world() {
		return ResponseEntity.ok("Hello world");
	}
}
