package org.example.behavioralpatterns.state;

public class HappyMood implements Mood {
    private Person person;

    public HappyMood(Person person) {
        this.person = person;
    }

    @Override
    public void express() {
        System.out.println("Человек улыбается и смеется!");
    }

    @Override
    public void talk() {
        System.out.println("Человек говорит быстро и восторженно!");
    }

    @Override
    public void work() {
        System.out.println("Человек работает с энтузиазмом и все успевает!");
    }
}