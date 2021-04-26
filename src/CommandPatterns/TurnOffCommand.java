package CommandPatterns;

public class TurnOffCommand implements ICommand{
    private Fan fan;

    public TurnOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }

    @Override
    public void undo() {
        fan.turnOn();
    }
}
