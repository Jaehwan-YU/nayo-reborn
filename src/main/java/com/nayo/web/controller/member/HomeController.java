package com.nayo.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("memberHomeController")
@RequestMapping("/member/")
public class HomeController {
	
	@GetMapping("food")
	public String food() {
		return "member.food";
	}
	
	@GetMapping("bookmark")
	public String bookmark() {
		return "member.bookmark";
	}
	
	@GetMapping("menu")
	public String menu() {
		return "member.menu";
	}
	
	@GetMapping("myinfo")
	public String myinfo() {
		return "member.myinfo";
	}
	
	@GetMapping("shopbag")
	public String shopbag() {
		return "member.shopbag";
	}
}
