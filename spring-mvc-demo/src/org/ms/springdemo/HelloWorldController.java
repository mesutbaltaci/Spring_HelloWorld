package org.ms.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the initial method
	@RequestMapping ("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
//	@RequestMapping ("/processForm2")
//	public String processForm() {
//		return "helloworld";
//	}
	
//	@RequestMapping
//	public String nameToUpperCase(HttpServletRequest request, Model model) {
//		String name= request.getParameter("username");
//		try { 
//			String result = "Hey " +name.toUpperCase(); 
//			model.addAttribute("message", result);
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		return "helloworld2";
//	}
	
	@RequestMapping("/processForm")
	public String showNameAndPassword (@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		
		return "helloworld2";
	}
	
}
