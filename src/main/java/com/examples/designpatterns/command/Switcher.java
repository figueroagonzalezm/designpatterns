package com.examples.designpatterns.command;

import java.util.ArrayList;
import java.util.List;


public class Switcher {

    private List<Command> commands;

    public Switcher() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        commands.forEach(Command::execute);
    }
}
