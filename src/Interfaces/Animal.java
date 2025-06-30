package Interfaces;

enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    @Override
    public void track() {

        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly(String name, String type) implements FlightEnabled {


    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}


class Satellite implements  OrbitEarth {
//    attempting to assign weaker access privileges ('package-private'); was 'public'
//    void achieveOrbit() {
//        System.out.println("Orbit achieved!");
//    }

    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }


    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends  FlightEnabled {

    void achieveOrbit();
}
// interfaces never gets instantiated and won't have a subclass that gets instantiated
interface FlightEnabled {

    double MILES_TO_KM = 1.60934; // constant
    double KM_TO_MILES = 0.621371;

    // Methods inside interface is really implicitly declare both public and abstract!
    public abstract void takeOff(); // meaning both public and abstract modifiers are redundant
    abstract void land(); // abstract modifier is redundant
    void fly(); // public and abstract modifier both are implied

    // if you omit an access modifier on a class member, it's implicitly package private
    // if you omit and access modifier on an interface member, it's implicitly public
    // private modifier isn't allowed in an interface member --> compiler error

    // interface doesn't implement another interface
    // both records and enums can implement interfaces
}

interface Trackable {

    void track();
}

public abstract class Animal {

    public abstract void move();
}
