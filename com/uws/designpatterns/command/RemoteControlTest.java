package com.uws.designpatterns.command;

import org.junit.jupiter.*;
import org.junit.jupiter.api.*;
import org.junit.internal.runners.statements.Fail;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class RemoteControlTest {
    
    @Mock
    private Light light;
    
    @Mock
    private LightsOnCommand lightsOnCommand;
    
    @Mock
    private LightsOffCommand lightsOffCommand;
    
    private RemoteControl control;
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        control = new RemoteControl();
    }
    



    @Test
    public void testLightSwitchingOnAndOff() {

        // Set the command to lights on and press the button
        control.setCommand(lightsOnCommand);
        control.pressButton();

        // Set the command to lights off and press the button
        control.setCommand(lightsOffCommand);
        control.pressButton();

        // Verify that the execute method was called on both commands
        // First we expect the lights on command to execute
        // Then we expect the lights off command to execute
        verify(lightsOnCommand, times(1)).execute();
        verify(lightsOffCommand, times(1)).execute();
    }
    


    @Test
    public void testMultiplePressesOnSameCommand() {

        // Set the command to lights on and press the button multiple times
        control.setCommand(lightsOnCommand);
        control.pressButton();
        control.pressButton();
        control.pressButton();

        // Verify that the execute method was called three times on the lights on command
        // we expect the lights on command to execute three times 
        verify(lightsOnCommand, times(3)).execute();
    }



}