package factory.factoryAfter;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                // Calculate distance from the center of the grid (radius, radius)
                int x = i - radius;
                int y = j - radius;

                // Check if the point is on the circle's boundary (rough approximation)
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
