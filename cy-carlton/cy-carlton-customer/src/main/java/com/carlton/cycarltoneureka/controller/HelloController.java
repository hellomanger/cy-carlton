package com.carlton.cycarltoneureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carlton.cycarltoneureka.service.HelloRemote;

@Controller
@RequestMapping("/customer")
public class HelloController {

	@Autowired
	HelloRemote helloRemote;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(String name) {
		return "customer:get  "+helloRemote.sayHello(name);
	}
	@RequestMapping("/test")
	@ResponseBody
	public String test(String name) {
		return "hello "+name;
	}
}
