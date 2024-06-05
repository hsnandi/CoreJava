package com.inheritance.germanshepherd;

public class Animal {

	private String species;
	private String breed;
	private String colour;
	
	

public Animal () {}

public Animal(String species, String breed, String colour) {
		super();
		this.species = species;
		this.breed = breed;
		this.colour = colour;
	}
public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "Animal [species=" + species + ", breed=" + breed + ", colour=" + colour + "]";
	}

}
