package com.fenast.onlineshooping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TestController {
	// Test Controller used to check if the requestMapping is working
	@RequestMapping(method = RequestMethod.GET)
	public String getTestPage(Model model) {
		model.addAttribute("greeting", "Hello Welcome to Online Shopping");
		return "welcome";
	}
}
