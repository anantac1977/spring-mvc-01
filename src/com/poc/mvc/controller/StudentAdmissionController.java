package com.poc.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.poc.mvc.model.Student;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		ModelAndView model = new ModelAndView("admissionForm");
		
		return model;
	}
	
	//One approach to bind Objects to view using @RequestParam
	
	/*@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitApplication(@RequestParam Map<String, String> requestParams){
		
		String name=requestParams.get("name");
		String hobby = requestParams.get("hobby");
		
		ModelAndView model = new ModelAndView("admissionSuccess");
		
		model.addObject("msg", "Details Submitted by you "+"Name: "+name+", "+"Hobby: "+hobby);
		
		return model;
	}*/
	
	//Another approach to bind Objects to view using @ModelAttribute
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitApplication(@ModelAttribute("student1") Student student1){
		
		
		ModelAndView model = new ModelAndView("admissionSuccess");
		
		model.addObject("msg", "Details Submitted by you ");
		
		return model;
	}
}
