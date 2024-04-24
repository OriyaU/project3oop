import java.time.LocalDateTime;
public class Flight extends Transportation {


    public Flight( String name, double price, LocalDateTime departureTime , int durationTime ,AirlineComposite airlineComposite){
        this.name = name;
        this.price = price;
        this.departureTime=departureTime ;
        this.durationTime=durationTime;
        this.isHapening=true;
        this.airlineComposite=airlineComposite;


       // super(name,price,departureTime,durationTime);
    }
    public double getPrice(){
        return price;
    }
    public LocalDateTime getDepartureTime(){
        return departureTime;
    }
    public int getDurationTime(){
        return durationTime;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void print (){
        System.out.println("Flight name  "+this.name+" price  "+this.price+" time "+this.departureTime+ " Duration Flight  "+this.durationTime);
    }

    @Override
    public boolean containsItem(String name) {
        return this.name.equals(name);
    }
    public void setCancelled()
    {
        this.isHapening=false;

    }
    public AirlineComposite getAirlineComposite(){
        return airlineComposite;
    }




}
