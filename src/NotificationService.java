import java.util.*;

public class NotificationService {
    private final Map<Event,List<EventListener>> passengerAndWorkers;



    public NotificationService() {
        this.passengerAndWorkers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> this.passengerAndWorkers.put(event, new ArrayList<>()));


    }


    public void intrestList(Event eventType,EventListener listener) {

        passengerAndWorkers.get(eventType).add(listener);
    }
    public void removeIntrestList(Event eventType, EventListener listener)
    {
        passengerAndWorkers.get(eventType).remove(listener);
    }
    public void sendNotification(Event eventType, Flight flight) {
        passengerAndWorkers.get(eventType).forEach(listener -> listener.update(eventType));
        if(eventType==Event.FLIGHT_CANCEL)
            flight.getAirlineComposite().removeItem(flight);



    }

}
