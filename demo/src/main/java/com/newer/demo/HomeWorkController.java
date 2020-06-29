package com.newer.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
public class HomeWorkController {
	
	@GetMapping
	public String homework() {
		return "homework";
	}

	@GetMapping("/a")
	public String a() {
		return "a";
	}
	
	@GetMapping("b")
	public String b() {
		return "b";
	}
	
	@GetMapping(path = {"x","y","z"})
	public String c() {
		return "x,y,z";
	}
}
