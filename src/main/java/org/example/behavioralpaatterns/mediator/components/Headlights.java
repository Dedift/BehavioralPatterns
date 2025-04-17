package org.example.behavioralpaatterns.mediator.components;


import org.example.behavioralpaatterns.mediator.mediators.CarMediator;

public class Headlights extends Component {
    private boolean isOn = false;

    public Headlights(CarMediator mediator) {
        super(mediator, "Фары");
    }

    @Override
    public void receive(String event) {
        switch (event) {
            case "turn_on":
                if (!isOn) {
                    isOn = true;
                    System.out.println("Фары включены");
                }
                break;
            case "turn_off":
                if (isOn) {
                    isOn = false;
                    System.out.println("Фары выключены");
                }
                break;
            case "engine_stopped":
                receive("turn_off");
                break;
        }
    }
}