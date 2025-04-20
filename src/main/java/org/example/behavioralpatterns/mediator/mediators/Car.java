package org.example.behavioralpatterns.mediator.mediators;


import org.example.behavioralpatterns.mediator.components.Component;

import java.util.HashMap;
import java.util.Map;

public class Car implements CarMediator {

    private Map<String, Component> components = new HashMap<>();

    @Override
    public void addComponent(Component component) {
        components.put(component.getName(), component);
    }

    @Override
    public void notify(Component sender, String event) {
        if (event.equals("engine_started")) {
            components.get("Фары").receive("turn_on");
            components.get("Кондиционер").receive("turn_on");
        } else if (event.equals("engine_stopped")) {
            components.get("Фары").receive(event);
            components.get("Кондиционер").receive(event);
        }
    }
}