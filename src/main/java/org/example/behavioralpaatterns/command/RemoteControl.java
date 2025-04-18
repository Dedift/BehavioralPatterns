package org.example.behavioralpaatterns.command;


import org.example.behavioralpaatterns.command.Commands.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}