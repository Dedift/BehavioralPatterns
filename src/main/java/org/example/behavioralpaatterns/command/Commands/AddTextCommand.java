package org.example.behavioralpaatterns.command.Commands;


import org.example.behavioralpaatterns.command.TextEditor;

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
