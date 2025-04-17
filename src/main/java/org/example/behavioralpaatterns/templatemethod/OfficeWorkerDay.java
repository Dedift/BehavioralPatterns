package org.example.behavioralpaatterns.templatemethod;

public class OfficeWorkerDay extends HumanDay {
    @Override
    protected void morning() {
        System.out.println("Просыпается в 6:30, делает зарядку");
    }

    @Override
    protected void day() {
        System.out.println("Работает в офисе с 9 до 13");
        System.out.println("Обедает в кафе с коллегами");
        System.out.println("Работает в офисе с 14 до 18");
    }

    @Override
    protected void evening() {
        System.out.println("Ходит в спортзал, затем ужинает с семьей");
    }
}