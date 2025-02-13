package com.hyosung.tnsplm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @클래스명 : TestController.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 11
 * @설명 :
 */
@RestController
public class TestController {

	@GetMapping(value = "/call")
	public String call() {
		return "call";
	}

}
