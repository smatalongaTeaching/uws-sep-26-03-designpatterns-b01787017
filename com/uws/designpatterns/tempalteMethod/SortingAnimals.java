package com.uws.designpatterns.tempalteMethod;

import java.util.Comparator;


/**
 * Holds concrete strategies for working with animal lists.
 * 
 * This class attempts to implement the Strategy pattern,
 * but the implementation is untidy because:
 * - It uses anonymous inner classes
 * - It uses raw Comparator types (no generics)
 * - It requires casting from Object to Animal
 * - Strategy logic is tightly coupled inside one class
 */

/*
 * Reviewed Design pattern in Gamma, Erich. Design patterns : elements of reusable object-oriented software. Reading, Mass: Addison-Wesley, 1995. 
 * Current implementation loosely follows the Strategy pattern
 * by providing different comparison behaviours.
 * However the strategies are implemented using anonymous inner classes,
 * making the design difficult to extend or reuse.
 */


public class SortingAnimals {
    

    // Private constructor prevents this class from being instantiated
    // It is intended to act as a container for sorting strategies
    private SortingAnimals(){}


    // Strategy for comparing animals based on whether they are vertebrates
    // Uses an anonymous inner class implementing Comparator
    public final Comparator vertebrayStrategyFunc = new Comparator() {
        @Override
        public int compare(Object t, Object t1) {

            // Cast objects to Animal because raw Comparator is used
            Animal firstAnimal = (Animal) t;
            Animal secondAnimal = (Animal) t1;

            // If both animals have the same vertebrate status they are equal
            if (firstAnimal.isVertebrate()
                    == secondAnimal.isVertebrate()) {
                return 0;

            // If one of them is a vertebrate return 1
            } else if (firstAnimal.isVertebrate()
                    || secondAnimal.isVertebrate()) {
                return 1;

            // Otherwise return -1
            } else {
                return -1;
            }
        }
    };
    

    // Strategy for comparing animals alphabetically by species name
    public final Comparator speciesStrategyFunc = new Comparator() {

        @Override
        public int compare(Object t, Object t1) {

            // Cast objects to Animal due to raw Comparator usage
            Animal firstAnimal = (Animal) t;
            Animal secondAnimal = (Animal) t1;

            // Compare species names using String comparison
            return firstAnimal.getSpecies().compareTo(secondAnimal.getSpecies());
        }
    };
}