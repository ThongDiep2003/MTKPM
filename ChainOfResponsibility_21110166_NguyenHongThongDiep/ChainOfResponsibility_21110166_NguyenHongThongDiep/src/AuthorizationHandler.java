
public class AuthorizationHandler implements Handler {
    private Handler nextHandler;

    public AuthorizationHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (!request.isAuthorized()) {
            // Handle authorization failure
            return;
        }
        nextHandler.handleRequest(request);
    }
}

