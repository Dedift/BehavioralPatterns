package org.example.behavioralpaatterns.command.Commands;

public interface UndoableCommand extends Command {
    void undo();
}
