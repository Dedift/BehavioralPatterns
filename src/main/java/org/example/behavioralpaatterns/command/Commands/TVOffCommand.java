package org.example.behavioralpaatterns.command.Commands;


import org.example.behavioralpaatterns.command.TV;

public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.switchOff();
    }
}