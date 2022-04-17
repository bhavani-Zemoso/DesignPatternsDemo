package prototypePattern;

public class Building implements Cloneable{

    private int height;
    private int width;
    private String color;

    public Building(int height, int width)
    {
        this.height = height;
        this.width = width;
        color = "";
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("Cloning Building... ");
        return(super.clone());
    }

    @Override
    public String toString()
    {
        return "A building of height : " + height + ", width : " + width + ", and color : " + color;
    }

}
