package org.example.behavioralpatterns.templatemethod;

public class StudentDay extends HumanDay {
    @Override
    protected void morning() {
        System.out.println("Просыпается в 8 утра, собирается в университет");
    }

    @Override
    protected void day() {
        System.out.println("Посещает лекции и практические занятия");
        System.out.println("Перекусывает в университетской столовой");
        System.out.println("Продолжает учиться");

    }

    @Override
    protected void evening() {
        System.out.println("Делает домашние задания и общается с друзьями");
    }

    @Override
    protected void night() {
        System.out.println("Ложится спать в 1 ночи после сериала");
    }
}
