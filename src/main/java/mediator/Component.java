package mediator;
public abstract class Component {
    protected SmartHomeMediator mediator;

    public Component(SmartHomeMediator mediator) {
        this.mediator = mediator;
    }
}
