package org.example.behavioralpaatterns.visitor;

public class Preschooler implements Child {
    private String name;
    private int age;

    public Preschooler(String name, int age) {
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