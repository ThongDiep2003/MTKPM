
class VolumeUpCommand implements Command {
    private Computer computer;

    public VolumeUpCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.volumeUp();
    }
}