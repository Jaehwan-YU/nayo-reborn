package com.nayo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipe/")
public class RecipeController {
	
	@GetMapping("list")
	public String list() {
		return "home.recipe.list";
	}
	
	@GetMapping("detail")
	public String detail() {
		return "home.recipe.detail";
	}
}
