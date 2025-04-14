package com.Inheritance.hierachical;

public class Circle extends Shape{
	double r;
	double pi = 3.14 ;
	double area;
	
	public Circle(double r) {
		this.r=r;
	}
	
	
	public void area_circle() {
		area = pi * r * r ;
		System.out.println("Area of circle is "+area);
	
	}

}
