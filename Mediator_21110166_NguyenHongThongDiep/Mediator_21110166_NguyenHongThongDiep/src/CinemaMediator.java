
public class CinemaMediator implements Mediator {
    private TicketCounter ticketCounter;
    private PaymentService paymentService;
    private CinemaHall cinemaHall;

    public void setTicketCounter(TicketCounter ticketCounter) {
        this.ticketCounter = ticketCounter;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    @Override
    public void handleEvent(Colleague colleague, String event) {
        if (colleague instanceof TicketCounter) {
            // Process event for TicketCounter
            paymentService.receiveEvent(event);
            cinemaHall.receiveEvent(event);
        } else if (colleague instanceof PaymentService) {
            // Process event for PaymentService
            ticketCounter.receiveEvent(event);
            cinemaHall.receiveEvent(event);
        } else if (colleague instanceof CinemaHall) {
            // Process event for CinemaHall
            ticketCounter.receiveEvent(event);
            paymentService.receiveEvent(event);
        }
    }
}


