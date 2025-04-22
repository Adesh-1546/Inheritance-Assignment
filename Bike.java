package com.inheritance.Vehicle;

public class Bike extends Vehicle{
	public Bike(String brand, int speed) {
		this.brand = brand ; 
		this.speed = speed ; 
		
	}
	public void showBikeType() {
		System.out.println("Bike Brand : "+brand);
		System.out.println("Bike top speed : "+speed + " kmph");
	}

}
