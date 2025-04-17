package org.example.behavioralpaatterns.strategy;

public class Main {
    public static void main(String[] args) {
        Duck kriaka = new Duck("Кряка");

        kriaka.move();

        System.out.println("Впереди озеро!");
        kriaka.setMovementStrategy(new SwimStrategy());
        kriaka.move();

        System.out.println("Впереди горы!");
        kriaka.setMovementStrategy(new FlyStrategy());
        kriaka.move();

        System.out.println("Впереди снова поле!");
        kriaka.setMovementStrategy(new WalkStrategy());
        kriaka.move();
    }
}
