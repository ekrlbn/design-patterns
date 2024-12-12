package decorator;

public class Facebook extends BaseDecorator{
    public Facebook(Component component) {
        super(component);
    }

    @Override
    public void execute(String message) {
        super.execute(message);
        System.out.println("Message from " + this.getClass().getName());
    }
}
