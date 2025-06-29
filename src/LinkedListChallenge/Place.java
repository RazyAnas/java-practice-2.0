package LinkedListChallenge;

public class Place {
    private String jagah; // jagah == place
    private double doori; // doori == distance

    public Place(String jagah, double doori) {
        this.jagah = jagah;
        this.doori = doori;
    }

    public String getJagah() {
        return jagah;
    }

    public double getDoori() {
        return doori;
    }

    @Override
    public String toString() {
        return jagah + " (" + doori + "km)";
    }
}
