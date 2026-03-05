package com.uws.designpatterns.observer;

public class User implements Observer {

    private final String name;

    private final RedDress redDress;

    public User(String name, RedDress redDress) {
        this.name = name;
        this.redDress = redDress;
    }

    @Override
    public void update() {
        buyDress();
        unsubscribe();
    }

    private void buyDress() {
        System.out.println(name + " has been notified. Buying the Red Dress...");
    }

    public void unsubscribe() {
        redDress.removeObserver(this);
        System.out.println(name + " unsubscribed from further notifications.");
    }
}