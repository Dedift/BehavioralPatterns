package org.example.behavioralpatterns.visitor;

public interface Child {
    void accept(NannyVisitor visitor);
    String getName();
    int getAge();
}
