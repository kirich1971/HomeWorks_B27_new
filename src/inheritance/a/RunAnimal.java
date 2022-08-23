package inheritance.a;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.a.Bird;

import java.util.ArrayList;

public class RunAnimal {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Dog one", 15, true, true, false);
        System.out.println(dog1);

        dog1.drinking();
        dog1.eating();
        dog1.sound();
        dog1.move();


        System.out.println("____________");

        Cat cat1 = new Cat("Cat One", 10, false, false);
        System.out.println(cat1);

        cat1.eating();
        cat1.drinking();
        cat1.sound();
        cat1.move();

        System.out.println("____________");

        Bird bird3 = new Bird("Bird", 3, true);
        System.out.println(bird3);
        bird3.eating();
        bird3.drinking();
        bird3.sound();
        bird3.move();


        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(dog1);
        zoo.add(cat1);
        zoo.add(bird3);
        System.out.println(zoo);

        for (Animal each : zoo) {
            System.out.println(each);
            each.sound();
        }

    }
}
