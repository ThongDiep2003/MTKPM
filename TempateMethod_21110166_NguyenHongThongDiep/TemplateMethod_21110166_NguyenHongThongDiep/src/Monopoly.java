
public class Monopoly extends Game {
    @Override
    protected void setupSpecifics() {
        System.out.println("Setting up Monopoly...");
        // Monopoly-specific setup
    }

    @Override
    protected void playTurn() {
        System.out.println("Playing a turn in Monopoly...");
        // Monopoly-specific play turn
    }

    @Override
    protected boolean endCondition() {
        System.out.println("Checking end condition in Monopoly...");
        // Monopoly-specific end condition
        return false; // Replace with actual condition
    }

    @Override
    protected void endSpecifics() {
        System.out.println("Ending Monopoly...");
        // Monopoly-specific end actions
    }
}

