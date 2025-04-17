package org.example.behavioralpaatterns.chainofresponsibility.manyhandlers;

public class SMSMessageHandler extends MessageHandler {

    public SMSMessageHandler(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void handle(String message) {
        System.out.println("Сообщение по СМС: " + message);
    }
}
