package com.inheritance.Vehicle;

public class Main {
	public static void main(String[] args) {
		Car c = new Car ("BMW",250);
		c.showCarType();
		Bike b = new Bike("Honda",150);
		b.showBikeType();
		System.out.println("----------------------");
		Car c1 = new Car("Toyota", 200);
		c1.showCarType();
		Bike b1 = new Bike("Suzuki",180);
		b1.showBikeType();
		
	}

}
