package org.example.behavioralpaatterns.mediator.mediators;


import org.example.behavioralpaatterns.mediator.components.Component;

public interface CarMediator {
    void notify(Component sender, String event);
    void addComponent(Component component);
}