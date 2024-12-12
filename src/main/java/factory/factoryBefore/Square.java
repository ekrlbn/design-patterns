package factory.factoryBefore;

public class Square implements Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
            // Loop through each row
            for (int i = 0; i < sideLength; i++) {
                // Loop through each column
                for (int j = 0; j < sideLength; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }

}
