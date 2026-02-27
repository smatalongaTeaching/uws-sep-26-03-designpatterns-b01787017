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
       Assertions.fail("Not implemented");

    }
    
    @Test
    public void testMultiplePressesOnSameCommand() {
       Assertions.fail("Not implemented");

    }
}