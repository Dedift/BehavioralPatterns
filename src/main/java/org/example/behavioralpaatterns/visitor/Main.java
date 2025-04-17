package org.example.behavioralpaatterns.visitor;

public class Main {
    public static void main(String[] args) {
        Child[] children = {
                new Baby("Анечка", 8),
                new Preschooler("Коля", 4),
                new Schoolchild("Маша", 9),
                new Baby("Ваня", 6),
                new Preschooler("Даша", 3)
        };

        NannyVisitor feedingNanny = new FeedingNanny();
        NannyVisitor playingNanny = new PlayingNanny();
        NannyVisitor sleepingNanny = new SleepingNanny();

        System.out.println("=== Кормление детей ===");
        for (Child child : children) {
            child.accept(feedingNanny);
        }

        System.out.println("\n=== Игры с детьми ===");
        for (Child child : children) {
            child.accept(playingNanny);
        }

        System.out.println("\n=== Укладывание спать ===");
        for (Child child : children) {
            child.accept(sleepingNanny);
        }
    }
}
