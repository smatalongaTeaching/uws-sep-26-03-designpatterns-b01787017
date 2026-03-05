package com.uws.designpatterns.tempalteMethod;

public class Snake implements Animal {

    @Override
    public boolean isVertebrate() {
        return true;
    }

    @Override
    public String getSpecies() {
        return "Snake";
    }
}