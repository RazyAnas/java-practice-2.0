public class Car {

    private String make = "Mahindra";
    private String model = "XUV 69";
    private String color = "Black";
    private int doors = 4;
    private boolean convertible = false;
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? " Convertible" : ""));
    }
}
