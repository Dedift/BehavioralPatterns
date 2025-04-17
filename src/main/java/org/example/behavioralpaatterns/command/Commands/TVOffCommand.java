package org.example.behavioralpatterns.command.Commands;

import org.example.behavioralpatterns.command.TV;

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