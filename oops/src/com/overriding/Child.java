package com.overriding;

public class Child extends Parent {

	public void printProfession() {
		System.out.println("Profession of Child:" + getProfession());
	}

	public Child getObject() {
		return new Child();
	}
}
