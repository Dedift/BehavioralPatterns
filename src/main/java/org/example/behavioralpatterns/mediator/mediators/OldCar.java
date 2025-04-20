package org.example.behavioralpatterns.mediator.mediators;


import org.example.behavioralpatterns.mediator.components.Component;

import java.util.HashMap;
import java.util.Map;

public class OldCar implements CarMediator {

    private Map<String, Component> components = new HashMap<>();

    @Override
    public void notify(Component sender, String event) {

    }

    @Override
    public void addComponent(Component component) {
        components.put(component.getName(), component);
    }
}
