package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//this will prepend what is in () to each path
//if typing path you must include this when you type
@RequestMapping("/greeting")
public class HomeController {
	@RequestMapping("/start")
	public String hello() {
		return "Hello out to the World!";
	}
	@RequestMapping("/hello")
	public String helloAgain() {
		return "Hello again world";
	}
//	you can also be specific in the request:
	@RequestMapping(value="/goodbye", method=RequestMethod.GET)
	public String goodbye() {
		return "Goodbye world";
	}
//	this takes info from the query and stores it in a variable
//	to search this in url /query?q=whateveryouwanttosearchhere
//	to add to use + not space
//	RequestParam arg required will always default to true you can set it to false RequestParam(value="a", required=false) String variable)
//	setting the required to false ensures that the user does not need to enter the value for the param
	@GetMapping("/query")
	public String query(@RequestParam(value="q") String answer) {
		return String.format("You searched for: %s", answer);
	}
//	this is going to be a common use function for displaying user id based on path variable
	@GetMapping("/user/{id}")
	public String userid(@PathVariable("id") Long id) {
		return "The user id you are looking for is " + id;
	}
	
}
