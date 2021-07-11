package com.ahut.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloApplication02 {

	@ModelAttribute
	public void init(Model model){
		System.out.println("初始化");
	}
	
	@RequestMapping(value="hello06")
	@ResponseBody
	public String hello06(){
		return "hello06";
	}

}
