package factory.factoryAfter;

public class LoginPanel extends Panel{
    @Override
    Shape createShape() {
        return new Circle(3);
    }
}
