package Composition.ComputerFactory;

public class PersonalComputer extends Products{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String manufacturer, String model, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(manufacturer, model);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200,5,"yellow");
    }
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
