package com.bean.springbean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class OdinaryController {

	//to display html file
	@GetMapping(value = "/home")
	public String testHtmlPage() {
		
		return"index";
	}
}
