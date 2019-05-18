package org.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
	@RequestMapping("/index")
	@ResponseBody
	public String getIndexPage() {		
		return "hello";
	}
}
