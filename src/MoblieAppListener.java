import java.util.Observable;

public class MoblieAppListener implements EventListener{
    private final String username;

    public MoblieAppListener(String username){
        this.username = username;
    }
    @Override
    public void update(Event eventType){

            System.out.println("Moblie App Update");
            if (eventType == Event.FLIGHT_DELAY)
                System.out.println("Your flight is delayed");
            if (eventType == Event.FLIGHT_CANCEL)
                System.out.println("Your flight is cancelled");
            if (eventType == Event.NEW_DEALS)
                System.out.println(" there are new deals");
        }


}
