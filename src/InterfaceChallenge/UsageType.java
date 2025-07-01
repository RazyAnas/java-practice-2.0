package InterfaceChallenge;

public enum UsageType {
    BUSINESS, ENTERTAINMENT, GOVERNMENT, PRIVATE, HOSPITAL;



    public String getMarker() {
        return String.valueOf(switch (this) {
            case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
            case HOSPITAL -> PointMarkers.SQUARE;
            default -> PointMarkers.CIRCLE;
        });
    }

}
