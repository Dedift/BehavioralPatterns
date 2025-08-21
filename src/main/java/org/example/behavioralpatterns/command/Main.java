package org.example.behavioralpatterns.command;

import org.example.behavioralpatterns.command.Commands.*;

public class Main {

    public static void main(String[] args) {

        System.out.printf("SAFasf");
        System.out.println("sdgdasg");
        System.out.println("=== 1. Undo/Redo Example ===");
        TextEditor editor = new TextEditor();
        CommandHistory history = new CommandHistory();

        history.execute(new AddTextCommand(editor, "Hello, "));
        history.execute(new AddTextCommand(editor, "World!"));
        System.out.println("Text: " + editor.getText()); // Hello, World!

        history.undo();
        System.out.println("After undo: " + editor.getText()); // Hello,

        System.out.println("\n=== 2. Command Queue Example ===");
        NotificationService notificationService = new NotificationService();
        CommandQueue queue = new CommandQueue();

        queue.addCommand(new EmailCommand(notificationService, "user@example.com", "Welcome!"));
        queue.addCommand(new SMSCommand(notificationService, "+123456789", "Hello!"));
        queue.processCommands();

        System.out.println("\n=== 3. Decoupling Example ===");
        Light light = new Light();
        TV tv = new TV();

        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton(); // Light is ON

        remote.setCommand(new TVOffCommand(tv));
        remote.pressButton(); // TV is OFF
    }
}