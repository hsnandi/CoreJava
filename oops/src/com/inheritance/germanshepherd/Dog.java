package com.inheritance.germanshepherd;

public class Dog extends Animal {
	 private int legs;

	 
	 public Dog() {}
	 
	public Dog(String species, String breed, String colour, int legs) {
		super(species,breed, colour);
		this.legs = legs;
	}


	public Dog(int legs) {
		super();
		this.legs = legs;
	}
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	 


	@Override
	public String toString()
	{
		return "Dog[leg=" + legs +super.toString()+"]";
		}

	}

