package factoryPattern;

import java.util.Scanner;

public class Square implements Shape{
    double sideLength;

    @Override
    public void draw() {
        System.out.println("Drawing a square of side length : " + sideLength);
    }

    @Override
    public void getDimensions() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the side length of square");
        double sideLength = reader.nextDouble();

        this.sideLength = sideLength;
    }
}
