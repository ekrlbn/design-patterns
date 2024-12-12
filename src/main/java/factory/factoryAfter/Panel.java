package factory.factoryAfter;

abstract public class Panel {
    abstract Shape createShape ();
    public void drawPanel() {
        Shape panel = createShape();
        panel.draw();
    }


}
