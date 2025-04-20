package org.example.behavioralpatterns.state;

public class AngryMood implements Mood {
    private Person person;

    public AngryMood(Person person) {
        this.person = person;
    }

    @Override
    public void express() {
        System.out.println("Человек хмурится и сжимает кулаки!");
    }

    @Override
    public void talk() {
        System.out.println("Человек кричит и ругается!");
    }

    @Override
    public void work() {
        System.out.println("Человек работает агрессивно, часто ошибается и ломает вещи!");
    }
}