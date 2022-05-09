package commandPattern;

import java.util.Arrays;

public class Remote {

    Command[] onCommands;
    Command[] offCommands;

    public Remote()
    {
        onCommands = new Command[5];
        offCommands = new Command[5];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 5; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand)
    {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot)
    {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot)
    {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return "Remote{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
