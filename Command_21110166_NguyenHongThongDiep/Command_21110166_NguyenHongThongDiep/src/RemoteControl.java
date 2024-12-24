import java.util.ArrayList;
import java.util.List;

class RemoteControl {
    private List<Command> commands;

    public RemoteControl() {
        this.commands = new ArrayList<>();
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void pressButton() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}