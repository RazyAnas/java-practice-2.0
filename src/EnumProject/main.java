package EnumProject;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);
        for (int i = 0; i < 9; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %-9s Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

            if (weekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");
            }
        }

        switchDayOfTheWeek(DayOfTheWeek.MON);
        switchDayOfTheWeek(DayOfTheWeek.SAT);

        System.out.println();

        // topping

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + ": " + topping.getPrice());
        }
    }

    public static void switchDayOfTheWeek(DayOfTheWeek weekDay) {

        int weekDatInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDatInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDatInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDatInteger);

        }
    }

    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
