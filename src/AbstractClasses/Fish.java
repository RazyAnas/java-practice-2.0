package AbstractClasses;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);

    }

    @Override
    public void move(String speed) {

        if (speed.equalsIgnoreCase("slow")) {
            System.out.println(getExplicitType() + " walking");
        } else {
            System.out.println(getExplicitType() + " running");
        }

    }

    @Override
    public void makeNoise() {

        if (type.equalsIgnoreCase("Goldfish")) {
            System.out.println("Swish! ");
        } else System.out.println("Splash! ");

    }
}
