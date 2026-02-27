package com.uws.designpatterns.command;
/*
    INVOKER
 */
public class RemoteControl{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
