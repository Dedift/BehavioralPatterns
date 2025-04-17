package org.example.behavioralpaatterns.mediator.mediators;


import org.example.behavioralpaatterns.mediator.components.Component;

import java.util.HashMap;
import java.util.Map;

public class SportCar implements CarMediator {
    private Map<String, Component> components = new HashMap<>();

    @Override
    public void addComponent(Component component) {
        components.put(component.getName(), component);
    }

    @Override
    public void notify(Component sender, String event) {
        if (event.equals("engine_started")) {
            components.get("Фары").receive("turn_on");
            System.out.println("Спортивный режим активирован!");
        } else if (event.equals("engine_stopped")) {
            components.get("Фары").receive("turn_off");
            components.get("Кондиционер").receive("turn_off");
        }
    }
}