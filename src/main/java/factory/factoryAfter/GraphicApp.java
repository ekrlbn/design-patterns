package factory.factoryAfter;

public class GraphicApp {

    public static void main(String[] args) {
        String panelType = "Login";
        Shape shape;
        Panel panel;
        if (panelType.equals("Login")) {
            panel = new LoginPanel();
        } else if (panelType.equals("Employee")) {
            panel = new EmployeePanel();
        } else {
            throw new RuntimeException("Panel type not recognized");
        }
        panel.drawPanel();
    }
}
