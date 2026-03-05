package com.uws.designpatterns.command;

// Concrete command that implements the Command interface
// Defines the action required to switch the light off
public class LightsOffCommand implements Command{

    // Reference to the receiver (Light) that will perform the action
    Light light;

    // Constructor receives the Light receiver and stores it
    // This links the command to the specific light it controls
    public LightsOffCommand(Light light){
        this.light = light;
    }

    // Executes the command by calling the receiver's method
    // This turns the light off
    public void execute(){
        light.switchOff();
    }
}
