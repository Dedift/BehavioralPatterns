package org.example.behavioralpaatterns.command.Commands;


import org.example.behavioralpaatterns.command.Light;

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