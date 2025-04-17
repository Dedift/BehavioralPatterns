package org.example.behavioralpaatterns.chainofresponsibility.onehandler;

public abstract class Restaurant {

    protected Restaurant nextRestaurant;

    public abstract void Handle(Receiver receiver);
}
