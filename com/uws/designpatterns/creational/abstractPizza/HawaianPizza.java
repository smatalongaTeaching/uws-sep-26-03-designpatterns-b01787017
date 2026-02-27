package com.uws.designpatterns.creational.abstractPizza;

public class HawaianPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Hawaian Pizza with pineapple and ham.");
    }

    @Override
    public void bake() {
        System.out.println("Baking Hawaian Pizza at 350 degrees.");
    }

    @Override
    public void box() {
        System.out.println("Boxing Hawaian Pizza in a special pizza box.");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Hawaian Pizza into 8 slices.");
    }

}
