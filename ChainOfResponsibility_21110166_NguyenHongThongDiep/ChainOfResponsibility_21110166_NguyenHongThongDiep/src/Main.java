
public class Main {
    public static void main(String[] args) {
        Handler authenticationHandler = new AuthenticationHandler(null);
        Handler authorizationHandler = new AuthorizationHandler(authenticationHandler);
        Handler loggingHandler = new LoggingHandler(authorizationHandler);

        Request request = new Request(true, true, "Some data");
        loggingHandler.handleRequest(request);
    }
}