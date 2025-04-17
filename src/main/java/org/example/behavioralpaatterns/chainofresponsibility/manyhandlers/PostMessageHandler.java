package org.example.behavioralpatterns.chainofresponsibility.manyhandlers;

public class PostMessageHandler extends MessageHandler {

    public PostMessageHandler(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void handle(String message) {
        System.out.println("Сообщение по почте: " + message);
    }
}
