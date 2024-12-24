
// Colleague abstract class
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendEvent(String event);
    public abstract void receiveEvent(String event);
}


