package org.example.behavioralpatterns.state;

public class SadMood implements Mood {
    private Person person;

    public SadMood(Person person) {
        this.person = person;
    }

    @Override
    public void express() {
        System.out.println("Человек вздыхает и выглядит подавленным...");
    }

    @Override
    public void talk() {
        System.out.println("Человек говорит тихо и медленно...");
    }

    @Override
    public void work() {
        System.out.println("Человек работает медленно и без интереса...");
    }
}