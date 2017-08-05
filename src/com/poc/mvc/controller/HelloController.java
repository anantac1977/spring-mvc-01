package com.poc.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController{

	@RequestMapping("/welcome/{countryName}")
	protected ModelAndView helloWorld(@PathVariable("countryName") String name){

		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "HelloWorld "+name);
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{countryName}/{userName}")
	protected ModelAndView hi(@PathVariable Map<String, String> pathVars){

		String name=pathVars.get("userName");
		String countryName=pathVars.get("countryName");
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "Hello "+name+ " You are from "+countryName);
		return modelAndView;
	}

}
