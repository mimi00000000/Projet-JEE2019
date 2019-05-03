package org.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {
	@RequestMapping("/index")
	@ResponseBody
	public String getIndexPage() {		
		return "hello";
	}
}
