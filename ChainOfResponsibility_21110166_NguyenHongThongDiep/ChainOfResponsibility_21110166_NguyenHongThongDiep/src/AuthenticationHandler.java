
public class AuthenticationHandler implements Handler {

    private Handler nextHandler;

    public AuthenticationHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (authenticate(request)) {
            System.out.println("User authenticated");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Authentication failed");
        }
    }

    private boolean authenticate(Request request) {
        // Implement authentication logic here
        return true;  // Replace with actual authentication logic
    }
}
