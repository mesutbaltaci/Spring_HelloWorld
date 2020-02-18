package org.ms.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class SillyController {
	@RequestMapping ("/showForm")
	public String displayTheForm() {
		return "silly";
	}
	
	
			
}
