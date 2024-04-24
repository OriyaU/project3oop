public class Passenger implements People {
    private String name;
    private Flight flight;
    private  int sitNumber;

    public Passenger(String name, Flight flight, int sitNumber) {
        this.name = name;
        this.flight = flight;
        this.sitNumber = sitNumber;

    }
    public String getName() {
        return name;
    }
    public Flight getFlight() {
        return flight;
    }
    public int getNumber() {
        return sitNumber;
    }

    public int getSitNumber() {
        return sitNumber;
    }

}
