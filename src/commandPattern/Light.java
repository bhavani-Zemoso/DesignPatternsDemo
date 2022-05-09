package commandPattern;

public class Light {

    String location;
    public Light(String location)
    {
        this.location = location;
    }

    public void on()
    {
        System.out.println("Switching on the light in the " + location);
    }

    public void off()
    {
        System.out.println("Switching off the light in the " + location);
    }

    @Override
    public String toString() {
        return "Light{" +
                "location='" + location + '\'' +
                '}';
    }
}
