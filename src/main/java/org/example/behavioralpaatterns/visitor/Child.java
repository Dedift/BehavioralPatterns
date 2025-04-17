package org.example.behavioralpaatterns.visitor;

public interface Child {
    void accept(NannyVisitor visitor);
    String getName();
    int getAge();
}
