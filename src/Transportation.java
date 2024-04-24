import com.sun.jdi.connect.Transport;

import java.time.LocalDateTime;

public abstract class Transportation implements Airline{
    protected String name;
    protected double price;
    protected LocalDateTime departureTime;
    protected int durationTime;
    protected boolean isHapening;
    protected AirlineComposite airlineComposite;

}
