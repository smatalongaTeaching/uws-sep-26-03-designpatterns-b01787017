package com.uws.designpatterns.creational.abstractPizza;

public class MargaritaPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Margarita Pizza with fresh tomatoes and basil.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Margarita Pizza at 400 degrees.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Margarita Pizza in a classic pizza box.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Margarita Pizza into 8 slices.");
    }

}
