//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Flight> flights = new ArrayList<>();
//        flights.add(new Flight("AA1234", 500, LocalDateTime.of(2025, 1, 2, 16, 6), 120)); // Correct format (HH:mm)
//        flights.add(new Flight("BA5678", 300, LocalDateTime.of(2025, 1, 2, 16, 5), 900)); // Correct format (HH:mm)
//        flights.add(new Flight("CX9012", 900, LocalDateTime.of(2025, 1, 2, 16, 8), 300)); // Correct format (HH:mm)
//        flights.add(new Flight("CX9012", 100, LocalDateTime.of(2025, 1, 2, 16, 2), 150));
//        Search flightSearch = new Search();
//        flightSearch.setSearchStrategy(new SFtakingoff()); // Use SFtakingoff for departure time sorting
//        List<Flight> sortedFlights = flightSearch.orderedFlight(flights);
//        System.out.println("Flights sorted by departure time:");
//        for (Flight flight : sortedFlights) {
//            System.out.println("name  " + flight.getName() + " price  " + flight.getPrice() + " time " + flight.getDepartureTime() + " Duration Flight  " + flight.getDurationTime()); // Print flight details (assuming Flight has a toString method)
//        }
//
//        flightSearch.setSearchStrategy(new SFtimeOfFlight()); // Use SFtakingoff for departure time sorting
//        sortedFlights = flightSearch.orderedFlight(flights);
//        System.out.println("Flights sorted by duration time flight:");
//        for (Flight flight : sortedFlights) {
//            System.out.println("name  " + flight.getName() + " price  " + flight.getPrice() + " time " + flight.getDepartureTime() + " Duration Flight  " + flight.getDurationTime()); // Print flight details (assuming Flight has a toString method)
//        }
//
//        flightSearch.setSearchStrategy(new SFprice()); // Use SFtakingoff for departure time sorting
//        sortedFlights = flightSearch.orderedFlight(flights);
//        System.out.println("Flights sorted by price of flight:");
//        for (Flight flight : sortedFlights) {
//            System.out.println("name  " + flight.getName() + " price  " + flight.getPrice() + " time " + flight.getDepartureTime() + " Duration Flight  " + flight.getDurationTime()); // Print flight details (assuming Flight has a toString method)
//        }
//
//        //part 2
//
//
//        AirPort airPort = new AirPort("Ben Gurion");
//
//        AirlineComposite root1 = new AirlineComposite("AirLineRoot");
//        airPort.addtoAirport(root1);
//
//        // לא בטוחה על המבנה שלי השדה תעופה זה שרשרת של חברות וטיסות ולכל חברה יש גם חברות וטיסות? האם נכון לעבור ככה עך תתי הילדים ולבדוק אותם בprint
//        AirlineComposite AirlineComposite1 = new AirlineComposite("Airline1");
//        AirlineComposite AirlineComposite2 = new AirlineComposite("Airline2");
//        Flight Flight1 = new Flight("A111", 500, LocalDateTime.of(2025, 1, 2, 16, 6), 120);
//        Flight Flight2 = new Flight("A222", 500, LocalDateTime.of(2025, 1, 2, 16, 6), 120);
//        Flight Flight3 = new Flight("A333", 500, LocalDateTime.of(2025, 1, 2, 16, 6), 120);
//        root1.add(AirlineComposite1);
//        root1.add(AirlineComposite2);
//        AirlineComposite1.add(Flight1);
//        AirlineComposite2.add(Flight2);
//        AirlineComposite2.add(Flight3);
//        root1.removeItem(Flight3);
//        airPort.printAirport();
//        System.out.println("Contains");
//        System.out.println(airPort.containsItem("A111"));
//        System.out.println(airPort.containsItem("A222"));
//        System.out.println(airPort.containsItem("A333"));
//        System.out.println(airPort.containsItem("Airline1"));

        //part 3

//        Passenger passenger1=new Passenger("shahar shlom",Flight1, 123);
//        Passenger passenger2=new Passenger("Dany bela",Flight1, 124);
//        Passenger passenger3=new Passenger("yael levi",Flight2, 123);
//        Passenger passenger4=new Passenger("yael levi",Flight2, 193);
//        Worker worker1=new Worker("Beny chohen", Flight3, 167);
//        Worker worker2=new Worker("Bar davied", Flight2, 168);
//
//        NotificationService notificationService = new NotificationService();
//
//        MoblieAppListener listener1 = new MoblieAppListener(passenger1.getName());
//        MoblieAppListener listener2 = new MoblieAppListener(passenger2.getName());
//        MoblieAppListener listener3 = new MoblieAppListener(passenger3.getName());
//
//        EmailMsgListener listener4= new EmailMsgListener("shahar@gmail.com");
//
//
//        notificationService.intrestList(Event.FLIGHT_CANCEL, listener1);
//        notificationService.intrestList(Event.FLIGHT_CANCEL, listener2);
//        notificationService.intrestList(Event.NEW_DEALS, listener3);
//        notificationService.intrestList(Event.FLIGHT_DELAY, listener4);
        // Create Airport
        AirPort benGurionAirport = new AirPort("Ben Gurion Airport");

        // Create Airlines
        AirlineComposite elAl = new AirlineComposite("El Al");
        AirlineComposite arkia = new AirlineComposite("Arkia");

        // Create Flights
        Flight flight11 = new Flight("Tel Aviv - New York", 1200.0, LocalDateTime.of(2024, 5, 10, 10, 0), 180,elAl);
        Flight flight22 = new Flight("Tel Aviv - London", 800.0, LocalDateTime.of(2024, 5, 15, 12, 0), 120,elAl);
        Flight flight33 = new Flight("Tel Aviv - Paris", 1000.0, LocalDateTime.of(2024, 5, 20, 15, 0), 150,arkia);

        // Assign Flights to Airlines
        elAl.add(flight11);
        elAl.add(flight33);
        arkia.add(flight22);

        // Add Airlines to Airport
        benGurionAirport.addtoAirport(elAl);
        benGurionAirport.addtoAirport(arkia);

        // Create Passengers and Workers
        Passenger passenger1 = new Passenger("Shahar Shlom", flight11, 123);
        Passenger passenger2 = new Passenger("Dany Bela", flight11, 124);
        Passenger passenger3 = new Passenger("Yael Levi", flight22, 123);

        Worker worker1 = new Worker("Beny Cohen", flight33, 167);
        Worker worker2 = new Worker("Bar Davied", flight22, 168);

        // Create Notification Service instance
        NotificationService notificationService = new NotificationService();

        // Create Email and Mobile App Listeners
        EmailMsgListener emailListener1 = new EmailMsgListener("shahar.shalom@example.com",flight11);
        EmailMsgListener emailListener2 = new EmailMsgListener("dany.bela@example.com",flight11);
        EmailMsgListener emailListener3 = new EmailMsgListener("yael.levi@example.com", flight22);

        MoblieAppListener mobileListener1 = new MoblieAppListener(passenger1.getName());
        MoblieAppListener mobileListener2 = new MoblieAppListener(passenger2.getName());
        MoblieAppListener mobileListener3 = new MoblieAppListener(passenger3.getName());

        // Register Listeners for Email and Mobile App Notifications
        notificationService.intrestList(Event.FLIGHT_CANCEL, emailListener1);
        notificationService.intrestList(Event.FLIGHT_CANCEL, emailListener2);
        notificationService.intrestList(Event.FLIGHT_CANCEL, emailListener3);

        notificationService.intrestList(Event.FLIGHT_CANCEL, mobileListener1);
        notificationService.intrestList(Event.FLIGHT_CANCEL, mobileListener2);
        notificationService.intrestList(Event.FLIGHT_CANCEL, mobileListener3);

        // Simulate Flight Cancellation
        System.out.println("Simulating flight cancellation for Flight2...");
        //elAl.removeItem(flight1); // Assuming Flight has a setCancelled(boolean) method
        flight22.setCancelled();

        // Send Notifications for Canceled Flight
        notificationService.sendNotification(Event.FLIGHT_CANCEL,flight22);
        benGurionAirport.removeItem(flight22);

        System.out.println("All passengers and workers registered for notifications.");
        System.out.println("Airport Details:");
        benGurionAirport.printAirport(); // Print airport information
    }







    

}

