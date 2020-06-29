package com.newer.demo;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	// GET 请求路径 '/'
	// 返回一个HTML 视图
	@GetMapping("/")
	public String home() {
		return "index.html";
	}
	
	// GET 请求 '/hello' 路径
	@GetMapping("/hello")
	// 响应体：返回的不是页面，返回数据 （HTTP 
	@ResponseBody
	public String hello(@RequestParam(name = "n",defaultValue = "老王")String name) {
		return "hello "+name;
	}
	
	@GetMapping("/add")
	@ResponseBody
	public String add(int a,int b) {		
		return String.format("%d + %d = %d", a,b,a+b);	
	}
	
	@GetMapping("/all")
	@ResponseBody
	public HashMap<String,Object> all(int a,@RequestParam(required = false,defaultValue = "3.14")int b){
		
		HashMap<String,Object> data = new HashMap<String,Object>();
		
		data.put("a", a);
		data.put("b", b);
		data.put("msg", "ok");
		data.put("flag", true);
		
		return data;
	}
	
//	@GetMapping
//	@PutMapping
//	@DeleteMapping
//	@PatchMapping
//	@RequestMapping(method = RequestMethod.GET)
	
	@GetMapping("/person")
	@ResponseBody
	public Person per(Person p) {
		
		return p;
	}
	
}
