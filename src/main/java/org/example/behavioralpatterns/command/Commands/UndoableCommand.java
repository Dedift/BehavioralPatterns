package org.example.behavioralpatterns.command.Commands;

public interface UndoableCommand extends Command {
    void undo();
}
