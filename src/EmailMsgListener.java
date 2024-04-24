public class EmailMsgListener implements EventListener {
    private final String email;
    private final Flight flight;
    public EmailMsgListener(String email,Flight flight) {
        this.email = email;
        this.flight = flight;
    }
    public void update(Event eventType){
        if(!flight.isHapening) {
            System.out.println("Email update");
            System.out.println(this.email);

            if (eventType == Event.FLIGHT_DELAY)
                System.out.println("Your flight is delayed");
            if (eventType == Event.FLIGHT_CANCEL)
                System.out.println("Your flight is cancelled");
            if (eventType == Event.NEW_DEALS)
                System.out.println(" there are new deals");
        }

    }
}
