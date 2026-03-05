package com.uws.designpatterns.tempalteMethod;

import java.util.Comparator;

public class VertebrateSorter extends AbstractAnimalSorter {

    @Override
    protected Comparator<Animal> getComparator() {

        return new Comparator<Animal>() {

            @Override
            public int compare(Animal a1, Animal a2) {

                if (a1.isVertebrate() == a2.isVertebrate()) {
                    return 0;
                }
                else if (a1.isVertebrate()) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };
    }
}