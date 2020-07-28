package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
	
	@RequestMapping("/ok")
	@ResponseBody
	public String getPage() {
		return "it's very ok , man ss";
	}
}
