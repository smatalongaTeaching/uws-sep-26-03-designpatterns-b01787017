package com.uws.designpatterns.tempalteMethod;

public class Cat implements Animal {

    @Override
    public boolean isVertebrate() {
        return true;
    }

    @Override
    public String getSpecies() {
        return "Cat";
    }
}