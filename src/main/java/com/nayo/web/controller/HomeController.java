package com.nayo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("HomeController")
@RequestMapping("/")
public class HomeController {

	
	@GetMapping("index")
	public String index() {
		
		return "home.index";
	}
}
