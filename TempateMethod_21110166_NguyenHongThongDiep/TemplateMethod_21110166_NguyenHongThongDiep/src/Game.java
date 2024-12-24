
public abstract class Game {
    // Constants
    protected static final int MAX_ROUNDS = 10;
    protected static final int MAX_TURNS = 5;

    // Template methods
    public final void setupGame() {
        System.out.println("Setting up the game...");
        setupSpecifics();
    }

    public final void startPlay() {
        System.out.println("Starting the game...");
        for (int round = 1; round <= MAX_ROUNDS; round++) {
            System.out.println("--- Round " + round + " ---");
            for (int turn = 1; turn <= MAX_TURNS; turn++) {
                playTurn();
                if (endCondition()) {
                    break;
                }
            }
        }
    }

    public final void endGame() {
        System.out.println("Ending the game...");
        endSpecifics();
    }

    // Hook methods
    protected abstract void setupSpecifics();

    protected abstract void playTurn();

    protected abstract boolean endCondition();

    protected abstract void endSpecifics();
}