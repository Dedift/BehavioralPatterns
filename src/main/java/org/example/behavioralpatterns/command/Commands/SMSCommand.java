package org.example.behavioralpatterns.command.Commands;


import org.example.behavioralpatterns.command.NotificationService;

public class SMSCommand implements Command {
    private NotificationService service;
    private String to;
    private String message;

    public SMSCommand(NotificationService service, String to, String message) {
        this.service = service;
        this.to = to;
        this.message = message;
    }

    @Override
    public void execute() {
        service.sendSMS(to, message);
    }
}