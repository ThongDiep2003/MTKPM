
public class PaymentService extends Colleague {
    public PaymentService(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendEvent(String event) {
        mediator.handleEvent(this, event);
    }

    @Override
    public void receiveEvent(String event) {
        System.out.println("PaymentService received event: " + event);
    }
}

