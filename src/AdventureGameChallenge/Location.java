package AdventureGameChallenge;

import java.util.HashMap;
import java.util.Map;

public class Location {
    String description;
    Map<String, String> nextPlaces;

    public Location(String description) {
        this.description = description;
        this.nextPlaces = new HashMap<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : nextPlaces.entrySet()) {
            String directionKey = entry.getKey();
            String placeValue = entry.getValue();
            // Convert directionKey to full name
            String directionFull;
            switch (directionKey) {
                case "N": directionFull = "north"; break;
                case "S": directionFull = "south"; break;
                case "E": directionFull = "east"; break;
                case "W": directionFull = "west"; break;
                default: directionFull = directionKey; // fallback
            }
            sb.append("A ")
                    .append(placeValue)
                    .append(" to the ")
                    .append(directionFull)
                    .append(" (")
                    .append(directionKey)
                    .append(")\n");
        }
        return sb.toString();
    }

}

