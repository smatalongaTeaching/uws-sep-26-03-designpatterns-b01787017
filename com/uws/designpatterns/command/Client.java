package com.uws.designpatterns.command;



// Client class: responsible for creating commands, receivers and assigning them to the invoker
public class Client{



    public static void main(String[] args)    {


        // Create the invoker (RemoteControl) which will trigger commands
        RemoteControl control = new RemoteControl();


        // Create the receiver (Light) which will perform the actual actions
        Light light = new Light();


        // Create concrete command objects and associate them with the receiver
        Command lightsOn = new LightsOnCommand(light);
        Command lightsOff = new LightsOffCommand(light);


        // Assign the "lights on" command to the remote control
        control.setCommand(lightsOn);

        // Simulate pressing the button which executes the command
        control.pressButton();


        // Assign the "lights off" command to the remote control
        control.setCommand(lightsOff);

        // Simulate pressing the button again which executes the command
        control.pressButton();

        
    }
}
