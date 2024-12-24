
class TurnOnComputerCommand implements Command {
    private Computer computer;

    public TurnOnComputerCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOn();
    }
}
