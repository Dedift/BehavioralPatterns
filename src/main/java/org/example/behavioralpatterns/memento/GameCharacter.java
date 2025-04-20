package org.example.behavioralpatterns.memento;

public class GameCharacter {
    private int level;
    private int health;
    private String location;

    public GameCharacter(int level, int health, String location) {
        this.level = level;
        this.health = health;
        this.location = location;
    }

    // Создание снимка текущего состояния
    public GameSave save() {
        return new GameSave(level, health, location);
    }

    // Восстановление состояния из снимка
    public void load(GameSave save) {
        this.level = save.getLevel();
        this.health = save.getHealth();
        this.location = save.getLocation();
    }

    // Методы для изменения состояния персонажа
    public void levelUp() {
        level++;
        health = 100; // Восстанавливаем здоровье при повышении уровня
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public void moveTo(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format("Персонаж: уровень %d, здоровье %d, локация '%s'",
                level, health, location);
    }
}