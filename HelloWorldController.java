package com.gcu;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/hello")
/*
 * this is user controller handing my login form 
 */
public class HelloWorldController  {
	
	 @RequestMapping(method = RequestMethod.GET)
	   public String printHello1(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");

	      return "hello";
	   }
	
	@RequestMapping(path = "/test1", method = RequestMethod.GET) 
	@ResponseBody 
	public String sayHello() {
		return "hello";
	}
	
	@RequestMapping(path = "/test2", method = RequestMethod.GET)
	
	public String printHello(ModelMap model)
	{
		model.addAttribute("message", "Hello Spring MVC");
		return "hello";
	}
	
	@RequestMapping(path = "/test3", method = RequestMethod.GET)
	public ModelAndView sayHello1() {
	ModelAndView mv = new ModelAndView();	
	mv.addObject("message","Hello World from ModelAndView");		
	mv.setViewName("hello");
	return mv;
	}
	
	@RequestMapping(path = "/test4", method = RequestMethod.GET)
	public String sayHello(@RequestParam("message") String message, ModelMap model) {
	model.addAttribute("message",  message);
	return "hello";
	}

}
