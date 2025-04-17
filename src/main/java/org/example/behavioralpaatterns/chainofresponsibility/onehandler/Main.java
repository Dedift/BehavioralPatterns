package org.example.behavioralpatterns.chainofresponsibility.onehandler;

public class Main {
    public static void main(String[] args) {


        Receiver receiver = new Receiver(true, false, false);

        Restaurant fastFoodRestaurant = new FastFoodRestaurant();
        Restaurant asianRestaurant = new AsianRestaurant();
        Restaurant koreanRestaurant = new KoreanRestaurant();

        fastFoodRestaurant.nextRestaurant = koreanRestaurant;
        koreanRestaurant.nextRestaurant = asianRestaurant;
        asianRestaurant.nextRestaurant = fastFoodRestaurant;

        fastFoodRestaurant.Handle(receiver);
        koreanRestaurant.Handle(receiver);
        asianRestaurant.Handle(receiver);
    }
}
