package org.example.behavioralpaatterns.state;

public class Person {
    private Mood currentMood;

    public Person() {
        // Начальное состояние - нейтральное
        this.currentMood = new NeutralMood(this);
    }

    public void setMood(Mood mood) {
        this.currentMood = mood;
    }

    // Методы, делегирующие выполнение текущему состоянию
    public void express() {
        currentMood.express();
    }

    public void talk() {
        currentMood.talk();
    }

    public void work() {
        currentMood.work();
    }

    // Методы для изменения состояния
    public void becomeHappy() {
        setMood(new HappyMood(this));
        System.out.println("Человек стал счастливым!");
    }

    public void becomeSad() {
        setMood(new SadMood(this));
        System.out.println("Человек стал грустным...");
    }

    public void becomeAngry() {
        setMood(new AngryMood(this));
        System.out.println("Человек разозлился!");
    }

    public void calmDown() {
        setMood(new NeutralMood(this));
        System.out.println("Человек успокоился.");
    }
}