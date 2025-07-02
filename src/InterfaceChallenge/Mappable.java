package InterfaceChallenge;

enum Geometry {
    LINE, POINT, POLYGON
}

public interface Mappable {

    // the interface should force classes to implement three methods
    abstract String getLabel(); // how the item will be described on the map
    abstract String getMarker(); // iconType sometimes called a "map marker" --> a black push pin for a point of interest or a red solid line for a highway for example
    abstract String getName();
    default String getShape() {
        if (this instanceof Building) {
            return String.valueOf(Geometry.POINT);
        } else if (this instanceof UtilityLine) {
            return String.valueOf(Geometry.LINE);
        } else {
            return String.valueOf(Geometry.POLYGON);
        }
    } // Geometry type which is what the type will look like on the map

    // in addition to three methods described, interface should also include:
    String JSON_PROPERTY = """
            "properties" :{%s}
            """;


    // a static method that takes Mappable instance as an argument
    // This method should also print out properties for each mappable type including those mentioned above BUT also any other fields
    static String mapIt(Mappable mappable) {
        String JSONResult = mappable.toJSON();
        return String.format(JSON_PROPERTY, JSONResult);
        // others
    }

    default String getTerm() {
        if (this instanceof UtilityLine) {
            return "utility";
        } else {
            return "usage";
        }
    }

    abstract String getType();
    // include a default method called toJSON() that prints type, label, marker
    default String toJSON() {
        // ("\"type\": \"" + getShape() + ", \"label\": " + getLabel() + ", \"marker\": " + getMarker())
        return String.format("\"type\": \"%s\", \"label\": \"%s\", \"marker\": \"%s\", \"name\": \"%s\", \"%s\": \"%s\"",  // there is an easy way just use String block and add .format
                getShape(), getLabel(), getMarker(), getName(), getTerm(), getType()); //saijsdsafj

    }

}
