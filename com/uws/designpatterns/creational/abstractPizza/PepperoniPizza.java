package com.uws.designpatterns.creational.abstractPizza;

public class PepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza with spicy pepperoni slices.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza at 375 degrees.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza in a special pizza box.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza into 8 slices.");
    }

}
