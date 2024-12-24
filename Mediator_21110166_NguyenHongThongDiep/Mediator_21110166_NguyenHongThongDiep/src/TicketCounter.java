
public class TicketCounter extends Colleague {
    public TicketCounter(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendEvent(String event) {
        mediator.handleEvent(this, event);
    }

    @Override
    public void receiveEvent(String event) {
        System.out.println("TicketCounter received event: " + event);
    }
}