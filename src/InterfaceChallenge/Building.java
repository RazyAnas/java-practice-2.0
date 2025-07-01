package InterfaceChallenge;

public class Building implements Mappable{
    private String label;
    private String name;
    private UsageType type;

    public Building(String name, UsageType type) {
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

    public String getType() {
        return type.name();
    }
}
