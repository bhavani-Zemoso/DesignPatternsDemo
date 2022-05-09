package commandPattern;

public class CeilingFanOnCommand implements Command{

    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan)
    {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public String toString() {
        return "CeilingFanOnCommand{" +
                "fan=" + fan +
                '}';
    }
}
