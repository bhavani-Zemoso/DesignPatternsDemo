package commandPattern;

import jdk.swing.interop.SwingInterOpUtils;

public class CeilingFan {
    String location;

    public CeilingFan(String location)
    {
        this.location = location;
    }

    public void on()
    {
        System.out.println("Switching on the fan in the " + location);
    }

    public void off()
    {
        System.out.println("Switching off the fan in the " + location);
    }

    @Override
    public String toString() {
        return "CeilingFan{" +
                "location='" + location + '\'' +
                '}';
    }
}
