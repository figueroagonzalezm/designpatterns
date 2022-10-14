package com.examples.patterns.command;

import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    public void commandTest(){
        Light light = new Light();

        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        Switcher switcher = new Switcher();
        switcher.addCommand(turnOnCommand);
        switcher.addCommand(turnOffCommand);

        switcher.executeCommands();
    }
}
