
class VolumeDownCommand implements Command {
    private Computer computer;

    public VolumeDownCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.volumeDown();
    }
}