package org.example.behavioralpatterns.visitor;

public class PlayingNanny implements NannyVisitor {
    @Override
    public void visit(Baby baby) {
        System.out.println("Нянечка играет с малышом " + baby.getName() +
                " в погремушки и ку-ку");
    }

    @Override
    public void visit(Preschooler preschooler) {
        System.out.println("Нянечка играет с дошкольником " + preschooler.getName() +
                " в кубики и читает книжки");
    }

    @Override
    public void visit(Schoolchild schoolchild) {
        System.out.println("Нянечка играет со школьником " + schoolchild.getName() +
                " в настольные игры и помогает с поделками");
    }
}
