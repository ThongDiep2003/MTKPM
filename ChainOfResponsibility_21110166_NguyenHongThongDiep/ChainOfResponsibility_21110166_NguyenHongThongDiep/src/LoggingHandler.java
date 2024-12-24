
public class LoggingHandler implements Handler {
    private Handler nextHandler;

    public LoggingHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        // Log the request
        System.out.println("Logging request: " + request);
        nextHandler.handleRequest(request);
    }
}
