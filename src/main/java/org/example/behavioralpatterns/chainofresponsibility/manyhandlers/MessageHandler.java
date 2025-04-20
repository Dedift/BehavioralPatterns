package org.example.behavioralpatterns.chainofresponsibility.manyhandlers;

public abstract class MessageHandler {

    public MessageHandler nextHandler;
    public PriorityLevel priorityLevel;

    public MessageHandler(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void handlerManager(String message, PriorityLevel level){
        if(level.ordinal() >= priorityLevel.ordinal()){
            handle(message);
        }
        if(nextHandler != null){
            nextHandler.handlerManager(message, level);
        }
    }

    public abstract void handle(String message);

}
