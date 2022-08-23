package inheritance;

public class Cat extends Animal {

    boolean isSpade;

    public Cat(String name, double weight, boolean isFemale, boolean isSpade) {
        super(name, weight, 4, isFemale);
        this.isSpade = isSpade;
    }


    @Override
    public void sound() {
        System.out.println("MOOOOOOOOORE");
    }

    @Override
    public void eating() {
        System.out.println("I ate Cat's food only");
    }


    @Override
    public void drinking() {
        System.out.println("I love to drink milk");
    }


}
