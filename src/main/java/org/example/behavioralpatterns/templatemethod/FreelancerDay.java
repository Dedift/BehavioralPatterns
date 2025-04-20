package org.example.behavioralpatterns.templatemethod;

public class FreelancerDay extends HumanDay {
    @Override
    protected void morning() {
        System.out.println("Просыпается в 10 утра, пьет кофе за компьютером");
    }

    @Override
    protected void day() {
        System.out.println("Работает над проектами в домашнем офисе");
        System.out.println("Готовит себе обед и ест во время просмотра YouTube");
        System.out.println("После еды лень работать");

    }

    @Override
    protected void evening() {
        System.out.println("Играет в игры");
    }

    @Override
    protected void night() {
        System.out.println("Ложится спать в 3 ночи после ночного кодинга");
    }
}