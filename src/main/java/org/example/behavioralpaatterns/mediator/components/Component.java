package org.example.behavioralpaatterns.mediator.components;


import org.example.behavioralpaatterns.mediator.mediators.CarMediator;

public abstract class Component {
    protected CarMediator mediator;
    protected String name;

    public Component(CarMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String event) {
        mediator.notify(this, event);
    }

    public void setMediator(CarMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void receive(String event);
}