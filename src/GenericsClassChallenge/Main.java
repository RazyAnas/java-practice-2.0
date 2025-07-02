package GenericsClassChallenge;

record GoogledPointLocation(String name, Double[] location) {}
record GoogledLineLocation(String name, Double[][] location) {}

public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[] {
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -12.0965"),
                new Park("Yosemite", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[] {
                new River("Mississippi", "47.2160, -95.23480", "35.1556, -90.0659", "29.1566, -89.2495"),
                new River("Missouri", "47.9239, -111.4958", "38.8146, -90.0659")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.renderLayer();
    }
}
