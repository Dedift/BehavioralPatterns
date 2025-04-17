package org.example.behavioralpatterns.chainofresponsibility.manyhandlers;

public class Main {
    public static void main(String[] args) {

        MessageHandler smsMessageHandler = new SMSMessageHandler(PriorityLevel.MIDDLE);
        MessageHandler emailMessageHandler = new EmailMessageHandler(PriorityLevel.LOW);
        MessageHandler postMessageHandler = new PostMessageHandler(PriorityLevel.HIGH);

        emailMessageHandler.nextHandler = smsMessageHandler;
        smsMessageHandler.nextHandler = postMessageHandler;

        emailMessageHandler.handlerManager("Сообщение низкого приоритета: ", PriorityLevel.LOW);
        emailMessageHandler.handlerManager("Сообщение среднего приоритета: ", PriorityLevel.MIDDLE);
        emailMessageHandler.handlerManager("Сообщение высокого приоритета: ", PriorityLevel.HIGH);
    }
}
