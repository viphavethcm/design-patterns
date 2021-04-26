package CommandPatterns;

public class Remote {
    private ICommand turnOnCommand;
    private ICommand turnOffCommand;

    public Remote(ICommand turnOnCommand, ICommand turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    void turnOnButton(){
        turnOnCommand.execute();
    }

    void turnOffButton(){
        turnOffCommand.execute();
    }
}
