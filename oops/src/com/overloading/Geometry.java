package com.overloading;

public class Geometry {
	public void area(int height, int breadth) {
		System.out.println("Area of rectangle: " + (height * breadth));
	}

	public void area(int radius) {
		System.out.println("Area of a Circle:" + (3.14 * radius * radius));
	}

	public void area(float radius) {
		System.out.println("Area of a Circle(float):" + (3.14 * radius * radius));
	}

	// Ambiguity
	public void area(int height, float breadth) {
		System.out.println("Area of rectangle:" + (height * breadth));
	}

}
