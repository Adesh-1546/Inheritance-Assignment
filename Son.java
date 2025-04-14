package com.Inheritance.multilevel;

public class Son extends Father{
	public void showSon () {
		System.out.println("This is method from Son Class ");
	}
	public static void main(String[] args) {
		Son s = new Son();
		
		s.showGrandfather();
		s.showFather();
		s.showSon();
	}
	

}
