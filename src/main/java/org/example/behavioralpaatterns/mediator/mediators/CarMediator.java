package org.example.behavioralpatterns.mediator.mediators;

import org.example.behavioralpatterns.mediator.components.Component;

public interface CarMediator {
    void notify(Component sender, String event);
    void addComponent(Component component);
}