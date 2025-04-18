package org.example.behavioralpaatterns.chainofresponsibility.onehandler;

public class Main {
    public static void main(String[] args) {


        Receiver receiver = new Receiver(false, true, false);

        Restaurant fastFoodRestaurant = new FastFoodRestaurant();
        Restaurant asianRestaurant = new AsianRestaurant();
        Restaurant koreanRestaurant = new KoreanRestaurant();

        fastFoodRestaurant.nextRestaurant = koreanRestaurant;
        koreanRestaurant.nextRestaurant = asianRestaurant;

        fastFoodRestaurant.Handle(receiver);
    }
}
