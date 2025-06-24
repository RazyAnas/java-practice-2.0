package LivingRoom;
/*
QUESTION:
Create a class called `Bedroom` that models a bedroom using **composition**.

You must also create the following component classes:
- `Wall`: has direction
- `Ceiling`: has height and painted color
- `Bed`: has style, pillows, height, sheets, quilt; with a method `make()`
- `Lamp`: has style, battery (boolean), globRating; with a method `turnOn()`

`Bedroom` should:
- Have 4 walls, 1 ceiling, 1 bed, 1 lamp
- Have a method `makeBed()` that calls `bed.make()`
- Have a method `getLamp()` that returns the lamp

---

TEST CASE (Main method):

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 1, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Anas's Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        System.out.println();
        bedroom.getLamp().turnOn();
    }
}

---

EXPECTED OUTPUT:

Bedroom -> Making bed | Bed -> Making |
Lamp -> Turning on
*/

public class Main {
}
