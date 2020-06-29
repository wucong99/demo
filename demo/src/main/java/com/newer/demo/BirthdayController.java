package com.newer.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BirthdayController {

	@GetMapping("/birthday/{year}/{mounth}/{day}")
	public HashMap<String,Object> birthday(
			@PathVariable int year,
			@PathVariable int mounth,
			@PathVariable String day
			){
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		
		map.put("年", year);
		map.put("月", mounth);
		map.put("日", day);
		return map;
	}
}
