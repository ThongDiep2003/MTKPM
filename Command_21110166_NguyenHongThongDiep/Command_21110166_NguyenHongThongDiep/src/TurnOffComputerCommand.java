
class TurnOffComputerCommand implements Command {
    private Computer computer;

    public TurnOffComputerCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOff();
    }
}