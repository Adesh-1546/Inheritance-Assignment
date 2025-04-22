package com.inheritance.Vehicle;

public class Car extends Vehicle {
	
	public Car(String brand, int speed) {
		this.brand = brand ; 
		this.speed = speed ; 
		
	}
	public void showCarType() {
		System.out.println("Car Brand : "+brand);
		System.out.println("Car top speed : "+speed + " kmph");
	}


}
