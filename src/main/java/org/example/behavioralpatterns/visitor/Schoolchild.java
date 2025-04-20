package org.example.behavioralpatterns.visitor;

public class Schoolchild implements Child {
    private String name;
    private int age;

    public Schoolchild(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void accept(NannyVisitor visitor) {
        visitor.visit(this);
    }
}