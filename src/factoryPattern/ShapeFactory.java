package factoryPattern;

import java.util.*;

public class ShapeFactory {

    Scanner reader = new Scanner(System.in);

    public Shape getShape(String typeOfShape)
    {

        if(typeOfShape.equalsIgnoreCase("Circle"))
            return new Circle();


        else if(typeOfShape.equalsIgnoreCase("Square"))
            return new Square();

        else if(typeOfShape.equalsIgnoreCase("Rectangle"))
            return new Rectangle();

        else
            return null;

    }
}
