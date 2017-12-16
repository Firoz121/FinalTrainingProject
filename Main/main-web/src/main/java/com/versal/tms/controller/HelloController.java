package com.versal.tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.versal.tms.model.User;

@Controller
public class HelloController {

	@RequestMapping("/reg")
	public String helloWorld() {
		User user =  new User();
		return "Reg";
	}
	
}
