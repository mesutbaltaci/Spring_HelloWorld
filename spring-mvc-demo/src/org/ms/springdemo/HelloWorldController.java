package org.ms.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the initial method
	@RequestMapping ("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	@RequestMapping ("/processForm")
	public String processForm() {
		return "helloworld";
	}
}