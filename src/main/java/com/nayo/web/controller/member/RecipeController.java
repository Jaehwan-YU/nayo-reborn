package com.nayo.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("memberRecipeController")
@RequestMapping("/member/")
public class RecipeController {

	@GetMapping("list")
	public String list() {
		return "member.recipe.list";
	}
	
	@GetMapping("reg")
	public String reg() {
		return "member.recipe.reg";
	}
}
