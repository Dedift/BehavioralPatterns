package org.example.behavioralpatterns.command.Commands;

import org.example.behavioralpatterns.command.NotificationService;

public class EmailCommand implements Command {
    private NotificationService service;
    private String to;
    private String message;

    public EmailCommand(NotificationService service, String to, String message) {
        this.service = service;
        this.to = to;
        this.message = message;
    }

    @Override
    public void execute() {
        service.sendEmail(to, message);
    }
}