package com.uws.designpatterns.command;

// Invoker class that triggers commands without knowing their internal logic
public class RemoteControl{

    // Stores the command currently assigned to the remote control
    private Command command;

    // Assigns a command to the remote control
    // The invoker will execute this command when the button is pressed
    public void setCommand(Command command){
        this.command = command;
    }

    // Simulates pressing the remote control button
    // Calls the execute method on the assigned command
    public void pressButton(){
        command.execute();
    }
}
