package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping(value = {"", "/hello"})
	public String hello(ModelMap model) {
		System.out.println("abc");
		List<String> list = new ArrayList<>();
		list.add("Velocity");
		list.add("Mybatis");
//		list.add("Spring webflow");
		model.addAttribute("list", list);
		return "hello";
	}
}
