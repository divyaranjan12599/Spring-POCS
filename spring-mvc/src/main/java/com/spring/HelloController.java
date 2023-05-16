package com.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/add")
	public String add(HttpServletRequest req) {
		
		System.out.println("------------"+req.getParameter("t1")+req);
		return "hello";
	}
	
}
