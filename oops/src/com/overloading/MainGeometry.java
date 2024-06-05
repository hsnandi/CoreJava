package com.overloading;

public class MainGeometry {
	public static void main(String[] args) {
		Geometry rectangle = new Geometry();
		rectangle.area(10, 20);

		Geometry circle = new Geometry();
		circle.area(12);

		Geometry circlec = new Geometry();
		circlec.area(12.2f);

		Geometry rectangleb = new Geometry();
		rectangleb.area(2, 3.5f);
	}
}
