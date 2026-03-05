package com.uws.designpatterns.tempalteMethod;

import java.util.Comparator;

public class SpeciesSorter extends AbstractAnimalSorter {

    @Override
    protected Comparator<Animal> getComparator() {

        return new Comparator<Animal>() {

            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.getSpecies().compareTo(a2.getSpecies());
            }
        };
    }
}