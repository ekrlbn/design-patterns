package mediator;

public class Alarm extends Component {
    private boolean active = false;

    public Alarm(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void trigger() {
        if (!active) return;
        System.out.println("Alarm triggered!");
        mediator.notify(this, "triggered");
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
