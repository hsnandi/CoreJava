package com.overriding;

public class MainParent {
	public static void main(String[] args) {
		Parent ramesh = new Parent();
		ramesh.setProfession("Clerk");

		Child raju = new Child();
		raju.setProfession("Vasuli"); 

		ramesh.printProfession();
		raju.printProfession();
	}
}
