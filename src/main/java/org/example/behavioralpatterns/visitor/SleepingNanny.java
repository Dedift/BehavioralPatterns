package org.example.behavioralpatterns.visitor;

class SleepingNanny implements NannyVisitor {
    @Override
    public void visit(Baby baby) {
        System.out.println("Нянечка укачивает малыша " + baby.getName() +
                " и поет колыбельную");
    }

    @Override
    public void visit(Preschooler preschooler) {
        System.out.println("Нянечка читает сказку дошкольнику " + preschooler.getName() +
                " перед сном");
    }

    @Override
    public void visit(Schoolchild schoolchild) {
        System.out.println("Нянечка напоминает школьнику " + schoolchild.getName() +
                " лечь спать пораньше");
    }
}