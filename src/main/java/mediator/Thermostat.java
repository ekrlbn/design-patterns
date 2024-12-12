package mediator;

public class Thermostat extends Component {
    public Thermostat(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void adjustTemperature(int temperature) {
        System.out.println("Thermostat adjusted to " + temperature + "°C.");
    }
}
