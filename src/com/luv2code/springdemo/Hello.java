package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("/")
	public String showHello() {
		return "HelloWorld";
	}
	
	@RequestMapping("/showForm")
	public String formDis() {
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String showDis(HttpServletRequest request, Model model) {
		String message = request.getParameter("StudentName");
		model.addAttribute("result", message);
		return "processForm";
	}
}
