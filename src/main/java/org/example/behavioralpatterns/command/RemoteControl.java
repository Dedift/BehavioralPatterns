package org.example.behavioralpatterns.command;


import org.example.behavioralpatterns.command.Commands.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}