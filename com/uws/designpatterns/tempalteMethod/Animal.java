package com.uws.designpatterns.tempalteMethod;

// Interface representing a generic animal
// Any class implementing Animal must provide these behaviours
public interface Animal {

    // Returns true if the animal is a vertebrate (has a backbone)
	public boolean isVertebrate();

    // Returns the species name of the animal
	public String getSpecies();

}