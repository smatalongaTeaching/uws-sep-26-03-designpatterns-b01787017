package com.uws.designpatterns.command;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CommandTest {

    @Test
    void testLightOnCommandExecuteCalled() {
        Command lightOnCommand = mock(LightsOnCommand.class);

        lightOnCommand.execute();
        verify(lightOnCommand, times(1)).execute();
    }
 
    @Test
    void testLightOffCommandExecuteCalled() {
        Command lightOffCommand = mock(LightsOffCommand.class);
        lightOffCommand.execute();
        verify(lightOffCommand, times(1)).execute();
    }

   
}