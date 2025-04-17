package org.example.behavioralpatterns.chainofresponsibility.onehandler;

public abstract class Restaurant {

    protected Restaurant nextRestaurant;

    public abstract void Handle(Receiver receiver);
}
