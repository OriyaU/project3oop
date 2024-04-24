public class Worker implements People {
    private String name;
    private int numberOfWorker;
    private Flight flight;

    public Worker(String name, Flight flight, int numberOfWorker) {
        this.name = name;
        this.numberOfWorker = numberOfWorker;
        this.flight = flight;

    }
    public String getName() {
        return name;

    }

    @Override
    public Flight getFlight() {
        return null;
    }


    @Override
    public int getNumber() {

        return numberOfWorker;
    }
}
