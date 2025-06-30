package AbstractClasses;

import java.util.ArrayList;

// Abstract = Cant be drawn on a piece of paper by us, for Example an animal needs more data
// Abstract method can only be implemented on an abstract class or an interface!
// Abstract class is declared using an abstract modifier
// Abstract class can also have concrete methods
// Why?: to think and create targeted implementations

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Shephard", "big", 150));
        animals.add(new Fish("Golfish", "small", 1));
        animals.add(new Fish("Baracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        animals.add(new Horse("Clydesdale", "large", 280));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currenMammal) { // check if our is mammal
                currenMammal.shedHair();
            }
        }


    }

    private static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("fast");

    }
}
