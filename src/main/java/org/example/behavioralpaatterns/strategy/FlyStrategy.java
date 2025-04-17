package org.example.behavioralpatterns.strategy;

public class FlyStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Лечу через горы, машу крыльями");
    }
}
