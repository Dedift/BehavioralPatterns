package org.example.behavioralpatterns.state;

public class NeutralMood implements Mood {
    private Person person;

    public NeutralMood(Person person) {
        this.person = person;
    }

    @Override
    public void express() {
        System.out.println("Человек спокоен и нейтрален.");
    }

    @Override
    public void talk() {
        System.out.println("Человек говорит спокойным тоном.");
    }

    @Override
    public void work() {
        System.out.println("Человек продуктивно работает.");
    }
}