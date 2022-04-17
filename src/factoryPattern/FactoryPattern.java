package factoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryPattern {
    public static void main(String args[]) throws IOException {
        ShapeFactory shapeFactory = new ShapeFactory();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the type of shape required");
            String shapeType = reader.readLine();
            Shape shape = shapeFactory.getShape(shapeType);

            shape.getDimensions();
            shape.draw();

    }
}
