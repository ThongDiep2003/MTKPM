
class BrightnessDownCommand implements Command {
    private Computer computer;

    public BrightnessDownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.brightnessDown();
    }
}
