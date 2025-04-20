package org.example.behavioralpatterns.templatemethod;

public class HardWorkerDay extends HumanDay {
    @Override
    protected void morning() {
        System.out.println("Просыпается в 5 утра, перекусывает и едет на работу");
    }

    @Override
    protected void day() {
        System.out.println("Все время работает, нет времени даже на обед");

    }

    @Override
    protected void evening() {
        System.out.println("работает до 10 вечера");
    }

    @Override
    protected void night() {
        System.out.println("Быстро ужинает и ложится спать");
    }
}
