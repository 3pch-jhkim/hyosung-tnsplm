package com.hyosung.tnsplm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hyosung.tnsplm.common.utils.ResponseUtils;

/**
 * @클래스명 : IndexController.java
 * @최초 작성자 :
 * @최초 작성일 : 2025. 02. 11
 * @설명 :
 */
@Controller
public class IndexController extends ResponseUtils {

	@GetMapping(value = "/index")
	public ModelAndView index() {
		System.out.println("호출이 안되냐!");
		return model("/index");
	}
}
