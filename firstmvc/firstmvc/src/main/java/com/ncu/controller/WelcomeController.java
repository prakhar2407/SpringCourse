package com.ncu.controller;




import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.models.Update;
import com.ncu.models.Users;

@Controller
public class WelcomeController {
	@RequestMapping("/reg")
	public String Home(Model model) {
		model.addAttribute("UserModel", new Users());
		
		return "client";
	}
	@RequestMapping(path = "/login",method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("UserModel") Users use , Model model) {
		
			model.addAttribute("Name", use.getUserid());
			
			model.addAttribute("Password", use.getPwd());
			model.addAttribute("Email", use.getEmail());
			model.addAttribute("Age", use.getAge());
			model.addAttribute("Gender", use.getGender());
			model.addAttribute("Area", use.getArea());
			model.addAttribute("State", use.getState());
			model.addAttribute("Country", use.getCountry());
		
		return "loginsuccess";
	}
	
	
	@RequestMapping("/upd")
	public String Home2(Model model) {
		model.addAttribute("UpdateModel", new Update("name","pasword","email id",7,"gender","Area","state","country"));
		
		return "update";
	}
	
	
	@RequestMapping(path = "/update1",method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("UpdateModel") Update upd , Model model) {
		
		
		
		
		
			model.addAttribute("Name", upd.getUserid());
			
			model.addAttribute("Password", upd.getPwd());
			model.addAttribute("Email", upd.getEmail());
			model.addAttribute("Age", upd.getAge());
			model.addAttribute("Gender", upd.getGender());
			model.addAttribute("Area", upd.getArea());
			model.addAttribute("State", upd.getState());
			model.addAttribute("Country", upd.getCountry());
		
		return "fullsuccess";
	}
	
	

	
	
	
	
	
}
		








