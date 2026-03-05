package com.uws.designpatterns.creational.abstractPizza;

public class VeggiePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza with mixed vegetables.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie Pizza at 380 degrees.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Veggie Pizza in a standard pizza box.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veggie Pizza into 8 slices.");
    }

    @Override
    public void ship() {
         System.out.println("Shipping Veggie Pizza with care.");
    }
}