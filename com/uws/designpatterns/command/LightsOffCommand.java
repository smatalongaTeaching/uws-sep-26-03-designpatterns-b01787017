package com.uws.designpatterns.command;

public class LightsOffCommand implements Command{
    //reference to the light
    Light light;
    public LightsOffCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOff();
    }
}
