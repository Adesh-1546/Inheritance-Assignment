package com.Inheritance.hierachical;

public class Rectangle extends Shape {
	double l;
	double w;
	double area;
	
	public Rectangle(double l ,double w ) {
		this.l=l;
		this.w=w;
	}
	
	public void area_reactangle() {
		area = l * w ; 
		System.out.println("Area of rectangle : "+ area);
	}

}
