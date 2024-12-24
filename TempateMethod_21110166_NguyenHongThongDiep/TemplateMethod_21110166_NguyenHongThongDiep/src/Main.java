
public class Main {
    public static void main(String[] args) {
        // Create a Monopoly game instance
        Game monopolyGame = new Monopoly();

        // Start the Monopoly game
        monopolyGame.setupGame();
        monopolyGame.startPlay();
        monopolyGame.endGame();

        // Create a Chess game instance
        Game chessGame = new Chess();

        // Start the Chess game
        chessGame.setupGame();
        chessGame.startPlay();
        chessGame.endGame();
    }
}
