package decorator;

public class Twitter extends BaseDecorator{
    public Twitter(Component component) {
        super(component);
    }

    @Override
    public void execute(String message) {
        super.execute(message);
        System.out.println("Message from " + this.getClass().getName());
    }
}
