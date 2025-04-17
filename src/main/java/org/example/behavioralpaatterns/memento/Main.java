package org.example.behavioralpaatterns.memento;

public class Main {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter(1, 100, "Стартовая локация");
        SaveManager saveManager = new SaveManager();

        System.out.println("Текущее состояние: " + hero);

        saveManager.saveGame(hero);

        hero.moveTo("Лес");
        hero.takeDamage(30);
        System.out.println("После получения урона: " + hero);

        if (saveManager.hasSaves()) {
            saveManager.loadLastSave(hero);
            System.out.println("После загрузки: " + hero);
        }

        hero.moveTo("Горы");
        hero.takeDamage(110);
        System.out.println("После получения урона: " + hero);

        if (saveManager.hasSaves()) {
            saveManager.loadLastSave(hero);
            System.out.println("После загрузки: " + hero);
        }

        hero.moveTo("Лес");
        hero.takeDamage(30);
        System.out.println("После получения урона: " + hero);
    }
}
