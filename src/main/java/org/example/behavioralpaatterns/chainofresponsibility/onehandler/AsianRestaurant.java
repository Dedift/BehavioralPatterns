package org.example.behavioralpaatterns.chainofresponsibility.onehandler;

public class AsianRestaurant extends Restaurant {

    @Override
    public void Handle(Receiver receiver)
    {
        if (receiver.FastFood)
            System.out.println("Пробуем азиатские деликатесы");
        else if (nextRestaurant != null)
            nextRestaurant.Handle(receiver);
    }
}
