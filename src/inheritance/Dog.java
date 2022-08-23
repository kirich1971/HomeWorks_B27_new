package inheritance;

public class Dog extends Animal {

    boolean hasTail;
    boolean isTrained;


    public Dog (String name, double weight, boolean isFemale) {

        super (name, weight, 4, isFemale);  // calls constructor from our SUPERCLASS (Animal)

    }


    public Dog(String name, double weight, boolean isFemale, boolean hasTail, boolean isTrained) {
        super (name, weight, 4, isFemale);
        this.hasTail = hasTail;
        this.isTrained = isTrained;
    }

    @Override
    public void eating() {
        System.out.println("I eat DOG food");
    }


    @Override
    public void sound() {
        System.out.println("I am barking");
    }

    @Override
    public String toString() {
        return super.toString() + " Dog{" +
                "hasTail=" + hasTail +
                ", isTrained=" + isTrained +
                '}';
    }
}
