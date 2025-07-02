package GenericsExtra;

public class LPAStudent extends Student {

    private double percentComplete;

    public LPAStudent() {
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete); // two %8.1f%% means: it's a specifier for the percent sign!
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
