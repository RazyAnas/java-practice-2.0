package PolymorphismChallenge;
/*
Polymorphism
        Description:

        For this exercise you will create four classes of vehicles. The first class should be named Car. This will be
        the base class for three other classes, Mitsubishi, Holden, and Ford.

        The first class contains four member variables, or fields, with these names and conditions:

        engine of type boolean

        cylinders of type int

        name of type String

        wheels of type int

        All four member variables should have private access.

        The constructor should accept two parameters, cylinders and name. Also, all of these cars have an engine and
        four wheels. So the other two fields should be set to default values.

        In addition, there are five other methods These methods should be defined as described below:

        startEngine accepts no parameters and returns a message which says that the car's engine is starting.

        accelerate accepts no parameters and returns a message that says the car is accelerating.

        brake accepts no parameters and returns a message stating the car is braking.

        The messages these methods return should somewhere contain the name of the class, Car.

        Two getter methods should also be defined here for the member variables cylinders and name. All methods have
        public access.

        The other three classes mentioned above are sub-classes of Car. These classes have no member variables and the
        constructor for each will call the parent constructor for object instantiation. Each of these classes will
        override the three parent methods startEngine, accelerate, and brake. The return messages for these methods
        should somewhere contain the name of the class to which the methods belong.

        Example input:

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        Example output:

        Car -> startEngine()
        Car -> accelerate()
        Car -> brake()
        Mitsubishi -> startEngine()
        Mitsubishi -> accelerate()
        Mitsubishi -> brake()
        Ford -> startEngine()
        Ford -> accelerate()
        Ford -> brake()
        Holden -> startEngine()
        Holden -> accelerate()
        Holden -> brake()
        Notes:

        Remember that your Main class is not included in the code evaluation.

        You should paste the code from each of your classes into the respective class file in the code evaluator.*/
public class Main {

    public static void main(String[] args) {
        Car car = new Car( 8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}