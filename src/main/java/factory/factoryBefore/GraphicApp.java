package factory.factoryBefore;

public class GraphicApp {

    public static void main(String[] args) {
        String panelType = "Login";
        Shape shape;
        if (panelType.equals("Login")) {
            shape = new Circle(4);
        } else if (panelType.equals("Employee")) {
            shape = new Square(4);
        } else {
            throw new RuntimeException("Panel type not recognized");
        }
        shape.draw();
    }
}
