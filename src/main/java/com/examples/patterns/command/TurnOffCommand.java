package com.examples.patterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOffCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.turnOff();
    }
}
