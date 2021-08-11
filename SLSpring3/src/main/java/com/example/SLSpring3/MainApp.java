package com.example.SLSpring3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mainapp")

public class MainApp {

	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	@ResponseBody
	public String sayWelcome() {
		return "Welcome to medical Portal";
	}
}
