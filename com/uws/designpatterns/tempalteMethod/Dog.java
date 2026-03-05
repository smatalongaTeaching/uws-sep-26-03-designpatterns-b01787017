package com.uws.designpatterns.tempalteMethod;

public class Dog implements Animal {

    public boolean isVertebrate() {
        return true;
    }

    public String getSpecies() {
        return "Dog";
    }
}