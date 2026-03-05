package com.uws.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class RedDress implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private boolean inStock;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyObservers();
    }
}