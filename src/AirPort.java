import javax.management.Notification;
import java.util.HashSet;

/// השדה תעופה יכול לקבל רק חברות תעופה חדשות
public class AirPort {
    private Airline airline;
    private String airportName;
    private HashSet<AirlineComposite> allFlightsAndAirlines;
    private final NotificationService notificationService;
    public AirPort(String airportName)
    {
        this.airportName = airportName;
        this.allFlightsAndAirlines = new HashSet<>();
        this.notificationService = new NotificationService();


    }
    public void addtoAirport(AirlineComposite airline){

        allFlightsAndAirlines.add(airline);
    }
    public void removeBigAirline(AirlineComposite airline){
        allFlightsAndAirlines.remove(airline);

    }
    public void printAirport(){
        System.out.println(airportName);
        for(Airline airline : allFlightsAndAirlines){
            airline.print();
        }
    }
//    public boolean containsItem(String name){
//
//        for(Airline item : allFlightsAndAirlines){
//           if( item.containsItem(name))
//               return true;
//        }
//        return false;
//    }
public boolean containsItem(String name) {
        if(allFlightsAndAirlines.contains(airline.getName()))
            return true;
        else {
            for (Airline item : allFlightsAndAirlines) {
                if (item.containsItem(name)) { // Call individual containsItem
                    return true;
                }
            }
        }
    return false;

}
public void removeItem(Airline item) {
        if(allFlightsAndAirlines.contains(item))
            allFlightsAndAirlines.remove(item);
        else {
            for (AirlineComposite airline : allFlightsAndAirlines) {
                airline.removeItem(item);

            }
        }
}


public void flightcanceled(){
    notificationService.notify();
}


//public boolean containsItem(String name){
//    for(Airline item : allFlightsAndAirlines){
//        if( item.getName().equals(name)) // Check flight name
//            return true;
//        if(item instanceof AirlineComposite){ // Check children recursively
//            if(((AirlineComposite) item).containsItem(name))
//                return true;
//        }
//    }
//    return false;
//}


}
