package com.ps.springmvc.metroriyadhapp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"", "/", "/home/*"})
public class HomeController {

	@RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/contactUs", method = RequestMethod.GET)
	public String contactUs() {
		return "Home/contactUs";
	}
	
	@RequestMapping(value = "/postInfo", method = RequestMethod.POST)
	public String postInfo(Model model, HttpServletRequest request) {
		String exampleText = request.getParameter("exampleText");
		model.addAttribute("exampleText",exampleText);
		
		return "index";
	}
}

