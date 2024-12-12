package factory.factoryBefore;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                int x = i - radius;
                int y = j - radius;

                if (Math.abs(x * x + y * y - radius * radius) < radius) {
                    System.out.print("* "); // Draw the point
                } else {
                    System.out.print("  "); // Empty space
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
