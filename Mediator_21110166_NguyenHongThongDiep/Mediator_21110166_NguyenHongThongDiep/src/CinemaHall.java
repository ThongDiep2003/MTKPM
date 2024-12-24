
public class CinemaHall extends Colleague {
    public CinemaHall(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendEvent(String event) {
        mediator.handleEvent(this, event);
    }

    @Override
    public void receiveEvent(String event) {
        System.out.println("CinemaHall received event: " + event);
    }
}

