package com.erictrudell.javatogo.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
//class mapping prepends ALL routes in class
//@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/{id}")
//	dependency injection. import model class / set it to a variable
	public String index(Model model, HttpSession session, @PathVariable("id") Long id) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Dragonfruit");
		fruits.add("Durian");
		fruits.add("Pomergranite");
		model.addAttribute("fruits", fruits);
		model.addAttribute("dictionaryName", "Eric");
//		setting the id to a long so that it is not just viewed as a string
		model.addAttribute("id", (Long) session.getAttribute("userId"));
		
//		path variable to pull id from path url for user's page displaying fruits
//		this puts the userId into session
		session.setAttribute("userId", id);
		
		return "indexx.jsp";
	}
	
	
}
