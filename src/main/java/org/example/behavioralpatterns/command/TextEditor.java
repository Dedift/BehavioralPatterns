package org.example.behavioralpatterns.command;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void addText(String newText) {
        text.append(newText);
    }

    public void deleteText(int length) {
        if (length > text.length()) length = text.length();
        text.delete(text.length() - length, text.length());
    }

    public String getText() {
        return text.toString();
    }
}
