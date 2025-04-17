package org.example.behavioralpatterns.command.Commands;

import org.example.behavioralpatterns.command.TextEditor;

public class AddTextCommand implements UndoableCommand{
    private TextEditor editor;
    private String text;

    public AddTextCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.addText(text);
    }

    @Override
    public void undo() {
        editor.deleteText(text.length());
    }
}
