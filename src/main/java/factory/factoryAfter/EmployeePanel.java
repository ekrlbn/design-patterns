package factory.factoryAfter;


public class EmployeePanel extends Panel{
    @Override
    Shape createShape() {
        return new Square(4);
    }
}
