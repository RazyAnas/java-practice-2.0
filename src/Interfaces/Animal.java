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

    public FlightStages getNextStage() {

        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length]; // ✅ So it’s a clever way to move to the next enum value in a circle.
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

    FlightStages stage = FlightStages.GROUNDED;

    public void achieveOrbit() {
        transition( "Orbit achieved!");
    }


    @Override
    public void takeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("landing");
    }

    @Override
    public void fly() {

        transition("Data Collection while Orbiting");
    }

    public void transition(String description){

        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    private static void log(String description) {

        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description) {

        description = stage+ ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {

        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
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

    // what would happen if we add another method in an interface
//    FlightStages transition(FlightStages stage); // this will give compiler error everywhere even in bird, jet etc. | therefore, we use extension method - default modifier

    default FlightStages transition(FlightStages stage) {
//        System.out.println("transition not implemented on "
//                + this.getClass().getName());
//        return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable {

    void track();
}

public abstract class Animal {

    public abstract void move();
}
