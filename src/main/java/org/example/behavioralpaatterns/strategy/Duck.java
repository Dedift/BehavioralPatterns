package org.example.behavioralpaatterns.strategy;

public class Duck {
    private MovementStrategy movementStrategy;
    private String name;

    public Duck(String name) {
        this.name = name;
        // По умолчанию утка ходит
        this.movementStrategy = new WalkStrategy();
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void move() {
        System.out.print(name + ": ");
        movementStrategy.move();
    }
}
