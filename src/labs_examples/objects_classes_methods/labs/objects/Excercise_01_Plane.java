package labs_examples.objects_classes_methods.labs.objects;

import org.w3c.dom.ls.LSOutput;

public class Excercise_01_Plane {

    public static void main(String[] args) {

        Passengers passengersOnFlight = new Passengers(145);
        DestinationCity myDestination = new DestinationCity("Bali");
        DepartureCity myDepartureCity = new DepartureCity("Las Vegas");
        Delayed tripDelayed = new Delayed(false);

        Plane myPlane = new Plane(passengersOnFlight, myDestination, myDepartureCity, tripDelayed, 150_000, "full");

        System.out.println("My trip from " + myPlane.departureCity.departure + " to "
                + myPlane.destinationCity.destination + " with " +  myPlane.passengers.passengers +
                " passengers on board has a " + myPlane.currentFuelLevel + " tank of " +
                myPlane.fuelCapacity + " liters of fuel and has a delayed status of " +
                myPlane.delayed.isDelayed);

        System.out.println(myPlane.toString());
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

    int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "passengers=" + passengers +
                '}';
    }
}

class DestinationCity {

    String destination;

    public DestinationCity(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "DestinationCity{" +
                "destination='" + destination + '\'' +
                '}';
    }
}

class DepartureCity {

    String departure;

    public DepartureCity(String departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "DepartureCity{" +
                "departure='" + departure + '\'' +
                '}';
    }
}

class Delayed {

    boolean isDelayed;

    public Delayed(boolean isDelayed){
        this.isDelayed = isDelayed;
    }

    @Override
    public String toString() {
        return "Delayed{" +
                "isDelayed=" + isDelayed +
                '}';
    }
}

