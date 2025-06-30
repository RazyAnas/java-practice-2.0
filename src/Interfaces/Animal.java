package Interfaces;

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

}

interface Trackable {

    void track();
}

public abstract class Animal {

    public abstract void move();
}
