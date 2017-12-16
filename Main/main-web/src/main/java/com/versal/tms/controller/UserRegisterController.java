package com.versal.tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.versal.tms.model.User;
import com.versal.tms.service.Userservice;


public class UserRegisterController {
	
	

	
@Autowired
 Userservice userservice;
	
@RequestMapping("/registrationform")
	
	public ModelAndView showdetails(Model model) {
		User user = new User();
		model.addAttribute("registration", user);
		return new ModelAndView("registrationform");
	}	

@RequestMapping(value="/register", method=RequestMethod.POST)
public ModelAndView processRegister(@ModelAttribute("registration")User user ,BindingResult result) {
	
	System.out.println(user.getLoginname());
	if(result.hasErrors()) {
		
		
	}

	userservice.registerUser(user);
	
	return new ModelAndView("registrationsuccess");

	}

}

	
		
		
	
	


