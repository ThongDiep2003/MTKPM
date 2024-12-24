
public class CinemaSystemDemo {
    public static void main(String[] args) {
        CinemaMediator mediator = new CinemaMediator();
        TicketCounter ticketCounter = new TicketCounter(mediator);
        PaymentService paymentService = new PaymentService(mediator);
        CinemaHall cinemaHall = new CinemaHall(mediator);
        mediator.setTicketCounter(ticketCounter);
        mediator.setPaymentService(paymentService);
        mediator.setCinemaHall(cinemaHall);
        ticketCounter.sendEvent("Book ticket for Avengers");
    }
}