package org.example.behavioralpatterns.visitor;

public class FeedingNanny implements NannyVisitor {
    @Override
    public void visit(Baby baby) {
        System.out.println("Нянечка кормит малыша " + baby.getName() +
                " (возраст " + baby.getAge() + " месяцев) из бутылочки");
    }

    @Override
    public void visit(Preschooler preschooler) {
        System.out.println("Нянечка кормит дошкольника " + preschooler.getName() +
                " (возраст " + preschooler.getAge() + " лет), помогает держать ложку");
    }

    @Override
    public void visit(Schoolchild schoolchild) {
        System.out.println("Нянечка накрывает обед для школьника " + schoolchild.getName() +
                " (возраст " + schoolchild.getAge() + " лет)");
    }
}
