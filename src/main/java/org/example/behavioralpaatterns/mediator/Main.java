package org.example.behavioralpaatterns.mediator;


import org.example.behavioralpaatterns.mediator.mediators.CarMediator;
import org.example.behavioralpaatterns.mediator.mediators.SportCar;

public class Main {
    public static void main(String[] args) {
        CarMediator car = new SportCar();
        Driver driver = new Driver(car);

        driver.startCar();
        driver.stopCar();
    }
}
