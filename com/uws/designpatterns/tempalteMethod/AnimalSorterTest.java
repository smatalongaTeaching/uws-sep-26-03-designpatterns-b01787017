package com.uws.designpatterns.tempalteMethod;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalSorterTest {

    @Test
    public void testSortBySpecies() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Octopus());
        animals.add(new Cat());

        AbstractAnimalSorter sorter = new SpeciesSorter();
        sorter.sortAnimals(animals);

        assertEquals("Cat", animals.get(0).getSpecies());
        assertEquals("Dog", animals.get(1).getSpecies());
        assertEquals("Octopus", animals.get(2).getSpecies());
    }

    @Test
    public void testSortByVertebrate() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());     
        animals.add(new Octopus());  
        animals.add(new Cat());     

        AbstractAnimalSorter sorter = new VertebrateSorter();
        sorter.sortAnimals(animals);

        assertFalse(animals.get(0).isVertebrate());
        assertTrue(animals.get(1).isVertebrate());
        assertTrue(animals.get(2).isVertebrate());
    }
}