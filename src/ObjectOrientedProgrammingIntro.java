public class ObjectOrientedProgrammingIntro {
    // Inheritance, Encapsulation, Polymorphism, Composition
    // oop  = class based programming = data + code
    // classes are blueprints for objects
    // look around -> real world objects (computer, keyboard, microphone, ant etc) -> state and behaviour
    // State of Object = characteristics about the item
    // State (ant) -> age, number of legs, conscious state, sleep/awake?
    // behaviour (Computer) -> booting, shutting down, copying, downloading
    // class = template/blueprint for creating objects
    // class member can be field or method -> if static value is associated with class itself
    // if not static -> it's called instance field and each object may have stored different values for this field
    // create Car.java
    // Encapsulation means to hide particular fields from public access
    // methods unlike fields are often public. Where method is method and field is field. :)


    public static void main(String[] args) {
        // using Car class here by defining object

        Car car = new Car();
//        car.make = "Porsche";
//        car.model = "Carrera";
//        car.color = "Red";
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        // requires getters and setters
        // getter is a method on a class the retrieves the value of a private field and returns it
        // setter is a method on a class that sets the value of private field
        // purpose = control and protect access to private fields
        car.describeCar();

        // null is a special keyword when no instance or object is assigned to the variable or field
        // fields are defined by default boolean = false, others = 0 / 0.0
    }
}
