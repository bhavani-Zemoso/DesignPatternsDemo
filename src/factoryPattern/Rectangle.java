package factoryPattern;

import java.util.Scanner;
public class Rectangle implements Shape{
    double length, breadth;

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle of length : " + length + " and breadth : " + breadth);
    }

    @Override
    public void getDimensions() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        double length = reader.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double breadth = reader.nextDouble();

        this.length = length;
        this.breadth = breadth;
    }
}
