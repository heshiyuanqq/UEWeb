package com.ue.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ue.uecommon.serviceInterface.TestService;

@Controller
public class IndexController {

	
		//注入dubbo的服务service
	/*
	   @Autowired
	   private TestService  testService;*/
	
	 	@RequestMapping("/index")
	    public String welcomePage(HttpServletRequest request, String msg,ModelMap model){
	 			System.out.println("ueweb     /index*********************************");
	 			return "index";
	    }
	 	
	 /*	
		@RequestMapping("/hello")
	    public String hello(HttpServletRequest request, String name,ModelMap model){
	 		   String msg = testService.hello(name);
	 		   System.out.println(msg);
	 		   model.addAttribute("msg", msg);
	 		   return "index";
	    }
	 	
	 	*/
	 	
	 	
	 	
	 	
	
}
