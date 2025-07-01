package InterfaceChallenge;

public class Main {
    public static void main(String[] args) {
        Mappable building = new Building("Sydney Town Hall", UsageType.GOVERNMENT);
        Mappable fiberOptic = new UtilityLine("College St", UtilityType.FIBER_OPTIC);

        System.out.println(Mappable.mapIt(building));
        System.out.println(Mappable.mapIt(fiberOptic));
    }
}
