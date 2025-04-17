package org.example.behavioralpatterns.mediator.components;

import org.example.behavioralpatterns.mediator.mediators.CarMediator;

public class Engine extends Component {
    private boolean isRunning = false;

    public Engine(CarMediator mediator) {
        super(mediator, "Двигатель");
    }

    @Override
    public void receive(String event) {
        switch (event) {
            case "start":
                if (!isRunning) {
                    isRunning = true;
                    System.out.println("Двигатель запущен");
                    send("engine_started");
                }
                break;
            case "stop":
                if (isRunning) {
                    isRunning = false;
                    System.out.println("Двигатель остановлен");
                    send("engine_stopped");
                }
                break;
        }
    }
}