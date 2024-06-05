package com.inheritance;

	
public class Dog extends Animal {
 private int legs;

 
 public Dog() {}
 
public Dog(float height,String colour,String noise,int legs) {
	super(height,colour,noise);
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
	return "Dog[leg=" + legs +",toString()="+super.toString()+"]";
	}

}
