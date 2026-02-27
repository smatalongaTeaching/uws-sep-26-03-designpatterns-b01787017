package com.uws.designpatterns.creational.abstractPizza;

import java.io.Console;

public class Pizza 
{
        public void prepare()
        {
            System.out.println("Preparing..");
        }

        public void bake()
        {
            System.out.println("Baking..");
        }

        public void box()
        {
            System.out.println("Boxing..");
        }

        public void cut()
        {
            System.out.println("Cutting.."); 
        }
}
