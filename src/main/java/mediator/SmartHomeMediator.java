package mediator;

public interface SmartHomeMediator {
    void notify(Component sender, String event);
    void addComponent(Component component);
}
