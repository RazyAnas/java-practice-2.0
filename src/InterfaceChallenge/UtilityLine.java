package InterfaceChallenge;

public class UtilityLine implements Mappable{

    private String label;
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
        this.label = name + " (" + type + ")";
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getMarker() {
        return type.getMarker();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type.name();
    }
}
