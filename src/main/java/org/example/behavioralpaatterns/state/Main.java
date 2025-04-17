package org.example.behavioralpatterns.state;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Начальное состояние - нейтральное
        person.express();
        person.talk();
        person.work();

        System.out.println("----------------------------------------------------------");

        // Человек становится счастливым
        person.becomeHappy();
        person.express();
        person.talk();
        person.work();

        System.out.println("----------------------------------------------------------");

        // Человек становится грустным
        person.becomeSad();
        person.express();
        person.talk();
        person.work();

        System.out.println("----------------------------------------------------------");

        // Человек злится
        person.becomeAngry();
        person.express();
        person.talk();
        person.work();

        System.out.println("----------------------------------------------------------");

        // Человек успокаивается
        person.calmDown();
        person.express();
        person.talk();
        person.work();
    }
}