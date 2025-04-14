package com.Inheritance.hierachical;

public class Main {
	public static void main(String[] args) {
		
		
		Rectangle r = new Rectangle(10,20);
		Triangle t = new Triangle(10,20);
		Circle c = new Circle(10);
		
		t.Area();
		
		t.area_tringle();
		r.area_reactangle();
		c.area_circle();
	}
	

}
