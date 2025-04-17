package org.example.behavioralpatterns.command.Commands;

import org.example.behavioralpatterns.command.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}