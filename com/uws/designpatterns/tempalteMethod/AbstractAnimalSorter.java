package com.uws.designpatterns.tempalteMethod;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public abstract class AbstractAnimalSorter {

    // Template method – defines the algorithm structure
    public final void sortAnimals(List<Animal> animals) {
        Collections.sort(animals, getComparator());
    }

    // Step that subclasses must implement
    protected abstract Comparator<Animal> getComparator();
}