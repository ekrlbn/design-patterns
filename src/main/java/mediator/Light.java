package mediator;
public class Light extends Component {
    public Light(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        System.out.println("Light turned on.");
        mediator.notify(this, "turnedOn");
    }

    public void turnOff() {
        System.out.println("Light turned off.");
        mediator.notify(this, "turnedOff");
    }
}
