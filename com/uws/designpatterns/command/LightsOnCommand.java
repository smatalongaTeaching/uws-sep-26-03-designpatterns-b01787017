package com.uws.designpatterns.command;

// Concrete command that implements the Command interface
// Represents the command to turn the light on
public class LightsOnCommand implements Command{
        
    // Reference to the receiver (Light) that will perform the action
    Light light;

    // Constructor receives the Light receiver and stores it
    // This associates the command with the specific light it will control
    public LightsOnCommand(Light light){
        this.light = light;
    }

    // Executes the command by calling the receiver's method
    // This turns the light on
    public void execute(){
        light.switchOn();
    }
}
