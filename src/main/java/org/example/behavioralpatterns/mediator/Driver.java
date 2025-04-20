package org.example.behavioralpatterns.mediator;


import org.example.behavioralpatterns.mediator.components.AirConditioner;
import org.example.behavioralpatterns.mediator.components.Component;
import org.example.behavioralpatterns.mediator.components.Engine;
import org.example.behavioralpatterns.mediator.components.Headlights;
import org.example.behavioralpatterns.mediator.mediators.CarMediator;

public class Driver {
    private Component engine;
    private Component headlights;
    private Component airConditioner;

    public Driver(CarMediator car) {
        this.engine = new Engine(car);
        this.headlights = new Headlights(car);
        this.airConditioner = new AirConditioner(car);

        car.addComponent(engine);
        car.addComponent(headlights);
        car.addComponent(airConditioner);
    }

    public void startCar() {
        System.out.println("\nВодитель запускает автомобиль");
        engine.receive("start");
    }

    public void stopCar() {
        System.out.println("\nВодитель останавливает автомобиль");
        engine.receive("stop");
    }

    public void adjustTemperature(int temp) {
        System.out.println("\nВодитель устанавливает температуру");
        airConditioner.receive("temp_" + temp);
    }
}