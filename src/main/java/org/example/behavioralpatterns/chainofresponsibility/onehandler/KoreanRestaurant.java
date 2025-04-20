package org.example.behavioralpatterns.chainofresponsibility.onehandler;

public class KoreanRestaurant extends Restaurant {

    @Override
    public void Handle(Receiver receiver)
    {
        if (receiver.KoreanFood)
            System.out.println("Едим острые корейские блюда");
        else if (nextRestaurant != null)
            nextRestaurant.Handle(receiver);
    }
}
