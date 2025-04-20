package org.example.behavioralpatterns.mediator;


import org.example.behavioralpatterns.mediator.mediators.CarMediator;
import org.example.behavioralpatterns.mediator.mediators.SportCar;

public class Main {
    public static void main(String[] args) {
        CarMediator car = new SportCar();
        Driver driver = new Driver(car);

        driver.startCar();
        driver.stopCar();
    }
}
