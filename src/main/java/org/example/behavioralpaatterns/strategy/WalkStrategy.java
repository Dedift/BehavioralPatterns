package org.example.behavioralpaatterns.strategy;

public class WalkStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Иду по полю шагами");
    }
}