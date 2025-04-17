package org.example.behavioralpaatterns.chainofresponsibility.onehandler;

public class Receiver {

    public boolean AsianFood;

    public boolean FastFood;

    public boolean KoreanFood;

    public Receiver(boolean asianFood, boolean fastFood, boolean koreanFood)
    {
        this.AsianFood = asianFood;
        this.FastFood = fastFood;
        this.KoreanFood = koreanFood;
    }
}
