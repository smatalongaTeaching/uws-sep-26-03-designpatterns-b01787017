package com.uws.designpatterns.command;

// Receiver class that performs the actual action requested by commands
public class Light{ 

    // Stores the current state of the light (true = on, false = off)
    private boolean on;

    // Method that turns the light on by updating its state
    public void switchOn(){
        on = true;
    }

    // Method that turns the light off by updating its state
    public void switchOff(){
        on = false;
    }
}
