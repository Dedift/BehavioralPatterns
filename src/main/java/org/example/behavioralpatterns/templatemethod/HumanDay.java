package org.example.behavioralpatterns.templatemethod;

public abstract class HumanDay {

    public final void spendDay() {
        morning();
        day();
        evening();
        night();
    }

    protected void morning() {
        System.out.println("Просыпается и встает с кровати");
    }

    protected void day() {
    }

    abstract protected void evening();

    protected void night() {
        System.out.println("Ложится спать");
    }
}
