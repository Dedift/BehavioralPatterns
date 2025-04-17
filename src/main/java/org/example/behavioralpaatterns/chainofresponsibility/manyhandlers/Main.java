package org.example.behavioralpaatterns.chainofresponsibility.manyhandlers;

public class Main {
    public static void main(String[] args) {

        MessageHandler smsMessageHandler = new SMSMessageHandler(PriorityLevel.MIDDLE);
        MessageHandler emailMessageHandler = new EmailMessageHandler(PriorityLevel.LOW);
        MessageHandler postMessageHandler = new PostMessageHandler(PriorityLevel.HIGH);

        emailMessageHandler.nextHandler = smsMessageHandler;
        smsMessageHandler.nextHandler = postMessageHandler;

        emailMessageHandler.handlerManager("Спам письмо", PriorityLevel.LOW);
        emailMessageHandler.handlerManager("Предупреждение МЧС об оранжевом уровне опасности.", PriorityLevel.MIDDLE);
        emailMessageHandler.handlerManager("Квитанция об оплате", PriorityLevel.HIGH);
    }
}
