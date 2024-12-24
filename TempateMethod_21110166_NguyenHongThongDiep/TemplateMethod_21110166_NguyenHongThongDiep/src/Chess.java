
public class Chess extends Game {
    @Override
    protected void setupSpecifics() {
        System.out.println("Setting up Chess...");
        // Chess-specific setup
    }

    @Override
    protected void playTurn() {
        System.out.println("Playing a turn in Chess...");
        // Chess-specific play turn
    }

    @Override
    protected boolean endCondition() {
        System.out.println("Checking end condition in Chess...");
        // Chess-specific end condition
        return false; // Replace with actual condition
    }

    @Override
    protected void endSpecifics() {
        System.out.println("Ending Chess...");
        // Chess-specific end actions
    }
}

