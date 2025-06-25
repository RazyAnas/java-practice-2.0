package PolymorphismChallengeFromVideo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.04, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red XCS", 15.02, 100);
        runRace(tesla);
//(String description, double avgKmPerLitre,int cylinders, int batterySize)
        Car maruti = new HybridCar("bhayankar Car v2.0", 50.3 , 8, 225);
        runRace(maruti);

    }
    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
