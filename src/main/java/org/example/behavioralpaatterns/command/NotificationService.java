package org.example.behavioralpaatterns.command;

public class NotificationService {
    public void sendEmail(String to, String message) {
        System.out.println("[Email] to " + to + ": " + message);
    }

    public void sendSMS(String to, String message) {
        System.out.println("[SMS] to " + to + ": " + message);
    }
}