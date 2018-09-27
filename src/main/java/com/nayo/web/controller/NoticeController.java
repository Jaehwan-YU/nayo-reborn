package com.nayo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice/")
public class NoticeController {

	@GetMapping("list")
	public String list() {
		return "home.notice.list";
	}
	
	@GetMapping("detail")
	public String detail() {
		return "home.notice.detail";
	}
}
