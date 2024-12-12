package decorator;

public class BaseDecorator implements Component{
    private Component component;

    public BaseDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void execute(String message) {
        this.component.execute(message);
    }
}
