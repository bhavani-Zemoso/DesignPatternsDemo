package commandPattern;

public class CeilingFanOffCommand implements Command{

    CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan)
    {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public String toString() {
        return "CeilingFanOffCommand{" +
                "fan=" + fan +
                '}';
    }
}
