package com.inheritance;

public class Animal {

private float height;
private String colour;
private String noise;

public Animal(float height, String colour, String noise) {
	super();
	this.height = height;
	this.colour = colour;
	this.noise = noise;
}

public Animal () {}

public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	colour = colour;
}
public String getNoise() {
	return noise;
}
public void setNoise(String noise) {
	this.noise = noise;
}

@Override
public String toString() {
	return ", Animal[height=" + height + ", colour=" + colour + ", noise=" + noise + "]";
}


}
