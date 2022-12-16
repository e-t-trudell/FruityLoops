package main;

import models.Human;

public class MammalHumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("Jeff");
		System.out.println("Hi, my name is "+ h1.name);
		System.out.println("I am " + h1.age +" years old. I am from " + h1.location);
		h1.regulateTemperature();
		
		Human h2 = new Human("Steve", 30, "Jupiter");
		System.out.println("Hi, my name is "+ h2.name);
		System.out.println("I am " + h2.age +" years old. I am from " + h2.location);
		h1.regulateTemperature();
	}

}
