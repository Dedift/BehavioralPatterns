package org.example.behavioralpaatterns.command.Commands;

import java.util.Stack;

public class CommandHistory {
    private Stack<UndoableCommand> history = new Stack<>();

    public void execute(UndoableCommand command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            UndoableCommand lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}