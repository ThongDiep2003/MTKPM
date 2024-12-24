
public class Request {
    private boolean authenticated;
    private boolean authorized;
    private String data;

    public Request(boolean authenticated, boolean authorized, String data) {
        this.authenticated = authenticated;
        this.authorized = authorized;
        this.data = data;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public String getData() {
        return data;
    }
}