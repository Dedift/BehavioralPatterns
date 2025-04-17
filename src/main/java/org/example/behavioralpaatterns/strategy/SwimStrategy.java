package org.example.behavioralpaatterns.strategy;

public class SwimStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Плыву по воде, перебирая лапками");
    }
}
