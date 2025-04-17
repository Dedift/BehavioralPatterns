package org.example.behavioralpatterns.chainofresponsibility.onehandler;

public class FastFoodRestaurant extends Restaurant {

    @Override
    public void Handle(Receiver receiver)
    {
        if (receiver.AsianFood)
            System.out.println("Кушаем фаст фуд");
        else if (nextRestaurant != null)
            nextRestaurant.Handle(receiver);
    }
}
