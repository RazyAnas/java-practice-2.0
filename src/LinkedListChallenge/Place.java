package LinkedListChallenge;

public record Place(String jagah, double doori) {


    public String getJagah() {
        return jagah;
    }


    @Override
    public String toString() {
        return jagah + " (" + doori + "km)";
    }
}
