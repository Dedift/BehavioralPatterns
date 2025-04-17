package org.example.behavioralpatterns.mediator.components;

import org.example.behavioralpatterns.mediator.mediators.CarMediator;

public class AirConditioner extends Component {
    private boolean isOn = false;
    private int temperature = 22;

    public AirConditioner(CarMediator mediator) {
        super(mediator, "Кондиционер");
    }

    @Override
    public void receive(String event) {
        if (event.startsWith("temp_")) {
            int newTemp = Integer.parseInt(event.substring(5));
            if (newTemp != temperature) {
                temperature = newTemp;
                System.out.println("Температура кондиционера установлена на " + temperature + "°C");
            }
            return;
        }

        switch (event) {
            case "turn_on":
                if (!isOn) {
                    isOn = true;
                    System.out.println("Кондиционер включен");
                }
                break;
            case "turn_off":
                if (isOn) {
                    isOn = false;
                    System.out.println("Кондиционер выключен");
                }
                break;
            case "engine_stopped":
                receive("turn_off");
                break;
        }
    }
}