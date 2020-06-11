package labs_examples.objects_classes_methods.labs.objects;

import org.w3c.dom.ls.LSOutput;

public class Excercise_01_Plane {

    public static void main(String[] args) {

        Passengers passengersOnFlight = new Passengers(145);
        DestinationCity myDestination = new DestinationCity("Bali");
        DepartureCity myDepartureCity = new DepartureCity("Las Vegas");
        Delayed tripDelayed = new Delayed(false);

        Plane myPlane = new Plane(passengersOnFlight, myDestination, myDepartureCity, tripDelayed, 150_000, "full");

        System.out.println("My trip from " + myPlane.departureCity.getDeparture() + " to "
                + myPlane.destinationCity.getDestination() + " with " +  myPlane.passengers.getPassengers() +
                " passengers on board has a " + myPlane.currentFuelLevel + " tank of " +
                myPlane.fuelCapacity + " liters of fuel and has a delayed status of " +
                myPlane.delayed.isDelayed());

        System.out.println(myPlane.toString());
        System.out.println(tripDelayed.toString());
        System.out.println(passengersOnFlight.toString());
        System.out.println(myDestination.toString());
        System.out.println(myDepartureCity.toString());
    }

}

class Plane {

    Passengers passengers;
    DestinationCity destinationCity;
    DepartureCity departureCity;
    Delayed delayed;
    double fuelCapacity;
    String currentFuelLevel;

    public Plane(Passengers passengers, DestinationCity destinationCity, DepartureCity departureCity, Delayed delayed, double fuelCapacity, String currentFuelLevel){
        this.passengers = passengers;
        this.destinationCity = destinationCity;
        this.departureCity = departureCity;
        this.delayed = delayed;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "passengers=" + passengers +
                ", destinationCity=" + destinationCity +
                ", departureCity=" + departureCity +
                ", delayed=" + delayed +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel='" + currentFuelLevel + '\'' +
                '}';
    }
}

class Passengers {

    private int passengers;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Passengers(int howManyPassengers) {
        setPassengers(howManyPassengers);
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "passengers=" + passengers +
                '}';
    }
}

class DestinationCity {

    private String destination;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public DestinationCity(String destination) {
        setDestination(destination);
    }

    @Override
    public String toString() {
        return "DestinationCity{" +
                "destination='" + destination + '\'' +
                '}';
    }
}

class DepartureCity {

    private String departure;

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public DepartureCity(String departure) {
        setDeparture(departure);
    }

    @Override
    public String toString() {
        return "DepartureCity{" +
                "departure='" + departure + '\'' +
                '}';
    }
}

class Delayed {

    private boolean isDelayed;

    public boolean isDelayed() {
        return isDelayed;
    }

    public void setDelayed(boolean delayed) {
        isDelayed = delayed;
    }

    public Delayed(boolean isDelayed){
        setDelayed(isDelayed);
    }

    @Override
    public String toString() {
        return "Delayed{" +
                "isDelayed=" + isDelayed +
                '}';
    }
}

