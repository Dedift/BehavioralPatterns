package org.example.behavioralpatterns.memento;

import java.util.Stack;

public class SaveManager {
    private Stack<GameSave> saves = new Stack<>();

    public void saveGame(GameCharacter character) {
        saves.push(character.save());
    }

    public void loadLastSave(GameCharacter character) {
        if (!saves.isEmpty()) {
            character.load(saves.peek());
        }
    }

    public boolean hasSaves() {
        return !saves.isEmpty();
    }
}