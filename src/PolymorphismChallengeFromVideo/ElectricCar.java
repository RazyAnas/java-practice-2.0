package PolymorphismChallengeFromVideo;

public class ElectricCar extends Car{
    private double avgKmPerCharge;
    // battery size is in kWh
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Read%n", batterySize);
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}
