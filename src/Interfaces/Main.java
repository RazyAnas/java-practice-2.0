package Interfaces;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird; // bird is an animal
        FlightEnabled flier = bird; // bird flies
        Trackable tracked = bird; // bird is trackable

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck(); // truck is trackable
        truck.track();
    }

    private static void  inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();

        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();

    }
}
