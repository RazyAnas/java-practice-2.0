package InterfaceChallenge;

public enum UtilityType {
    ELECTRICAL, FIBER_OPTIC, TELEVISION;

    public String getMarker() {
        return String.valueOf(switch (this) {
            case ELECTRICAL -> Color.RED + " " + LineMarkers.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " +LineMarkers.DOTTED;
            default -> LineMarkers.SOLID;
        });
    }

}
