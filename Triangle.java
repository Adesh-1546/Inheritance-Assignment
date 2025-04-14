package com.Inheritance.hierachical;

public class Triangle extends Shape {
	double h;
	double b;
	double area;
	
	public Triangle(double h, double b) {
		this.h=h;
		this.b=b;
	}
	public void area_tringle() {
		area = 0.5 * b * h ; 
		System.out.println("Area of Triangle is "+area);
		
	}

}
