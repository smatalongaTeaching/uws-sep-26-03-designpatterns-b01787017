package com.uws.designpatterns.tempalteMethod;

import java.util.ArrayList;
import java.util.List;

public class TemplateMethodDemo {

    public static void main(String[] args) {


        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Octopus());
        animals.add(new Snake());
        animals.add(new Cat());

        System.out.println("Original list:");
        printAnimals(animals);


        AbstractAnimalSorter speciesSorter = new SpeciesSorter();
        speciesSorter.sortAnimals(animals);

        System.out.println("\nSorted by species:");
        printAnimals(animals);


        AbstractAnimalSorter vertebrateSorter = new VertebrateSorter();
        vertebrateSorter.sortAnimals(animals);

        System.out.println("\nSorted by vertebrate:");
        printAnimals(animals);
    }

    private static void printAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a.getSpecies() + " (vertebrate=" + a.isVertebrate() + ")");
        }
    }
}