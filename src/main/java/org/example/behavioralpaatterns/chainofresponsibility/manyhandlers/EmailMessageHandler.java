package org.example.behavioralpaatterns.chainofresponsibility.manyhandlers;

public class EmailMessageHandler extends MessageHandler {

    public EmailMessageHandler(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void handle(String message) {
        System.out.println("Сообщение по email: " + message);
    }
}
