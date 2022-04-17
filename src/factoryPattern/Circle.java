package factoryPattern;

import java.util.Scanner;

public class Circle implements Shape {
    double radius;

    @Override
    public void draw() {
        System.out.println("Drawing a circle of radius : " + radius);
    }

    @Override
    public void getDimensions() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        double radius = reader.nextDouble();

        this.radius = radius;
    }
}
