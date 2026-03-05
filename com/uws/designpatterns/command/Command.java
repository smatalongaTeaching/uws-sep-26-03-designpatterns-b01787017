package com.uws.designpatterns.command;


// Command interface defines the common method that all command objects must implement
public interface Command{

    // Method that executes the command action
    // Each concrete command class must implement this method
    public void execute();
}
