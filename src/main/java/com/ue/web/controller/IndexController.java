package com.ue.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	 	@RequestMapping("/index")
	    public String welcomePage(HttpServletRequest request, String msg,ModelMap model){
	 			return "index";
	    }
	
}
