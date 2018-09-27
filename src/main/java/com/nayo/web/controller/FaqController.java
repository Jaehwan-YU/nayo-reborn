package com.nayo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faq/")
public class FaqController {
	
	@GetMapping("list")
	public String list() {
		return "home.faq.list";
	}
}
