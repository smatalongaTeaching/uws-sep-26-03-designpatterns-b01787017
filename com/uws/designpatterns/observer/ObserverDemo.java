package com.uws.designpatterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {

        RedDress redDress = new RedDress();

        User user1 = new User("User1", redDress);
        User user2 = new User("User2", redDress);
        User user3 = new User("User3", redDress);

        redDress.addObserver(user1);
        redDress.addObserver(user2);
        redDress.addObserver(user3);

        System.out.println("Red Dress is now IN STOCK");
        redDress.setInStock(true);

        System.out.println("\nRed Dress stock updated again");
        redDress.setInStock(true);
    }
}