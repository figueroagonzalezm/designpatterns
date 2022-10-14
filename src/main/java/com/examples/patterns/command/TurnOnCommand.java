package com.examples.patterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOnCommand implements Command {

    private Light light;

    @Override
    public void execute() {
        light.turnOn();
    }
}
