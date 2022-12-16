package models;

public class Mammal {
	public int age = 18;
	public String location = "Earth";
	public boolean sleeping = false;
	
	public Mammal() {
		System.out.println("*** Superclass Constructor***");
	}
	public Mammal(int age) {
		this.age = age;
		System.out.println("***Superclass Construtor***");
	}
	public Mammal(String location) {
		this.location = location;
		System.out.println("***Superclass Construtor***");
	}
	public Mammal(int age, String location) {
		this.age = age;
		this.location = location;
		System.out.println("***Superclass Construtor***");
	}
	public void regulateTemperature() {
		System.out.println("My temperature is just right, now.");
	}
	public void startSleeping() {
		sleeping = true;
		System.out.println("ZzZzZz...");
	}
	public boolean isSleeping() {
		return sleeping;
	}
	
}
