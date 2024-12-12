package mediator;

public class Door extends Component {
    public Door(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void open() {
        System.out.println("LOG: Door is open");
        mediator.notify(this, "open");
    }

    public void close() {
        System.out.println("LOG: Door is closed");
        mediator.notify(this, "close");
    }

}
