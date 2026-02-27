package com.uws.designpatterns.tempalteMethod;

import java.util.Comparator;

/**
 * Holds concrete strategies for working with animal lists.
 */
public class SortingAnimals {
    
       
    private SortingAnimals(){}

    public final Comparator vertebrayStrategyFunc = new Comparator() {
        @Override
        public int compare(Object t, Object t1) {
            Animal firstAnimal = (Animal) t;
            Animal secondAnimal = (Animal) t1;

            if (firstAnimal.isVertebrate()
                    == secondAnimal.isVertebrate()) {
                return 0;
            } else if (firstAnimal.isVertebrate()
                    || secondAnimal.isVertebrate()) {
                return 1;
            } else {
                return -1;
            }
        }
    };
    
    

    public final Comparator speciesStrategyFunc = new Comparator() {

        @Override
        public int compare(Object t, Object t1) {
            Animal firstAnimal = (Animal) t;
            Animal secondAnimal = (Animal) t1;

           return firstAnimal.getSpecies().compareTo(secondAnimal.getSpecies());
        }
    };
}