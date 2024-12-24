
class BrightnessUpCommand implements Command {
    private Computer computer;

    public BrightnessUpCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.brightnessUp();
    }
}
