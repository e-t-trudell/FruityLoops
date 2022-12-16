package com.erictrudell.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.erictrudell.fruityloops.models.Item;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.5));
		fruits.add(new Item("Strawberry", 5.5));
		fruits.add(new Item("Banana", 0.5));
		fruits.add(new Item("Dragonfruit", 10.5));
		model.addAttribute("fruitList", fruits);
		System.out.println(model.getAttribute("fruitList"));
		return "index.jsp";
	}
	
}
