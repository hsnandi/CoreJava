package com.overriding;

public class Parent {
	private String profession;

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void printProfession() {
		System.out.println("Profession of parent:" + profession);
	}

	public Parent getObject() {
		return new Parent();
	}
	
	
	
}
