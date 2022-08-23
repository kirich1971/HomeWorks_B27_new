package inheritance;

public class Animal   {   // is a subclass of superclass Object by default

    String name;
    protected double weight;
    int  paws;
    boolean isFemale;


    public Animal() {
        super();
    }

    public Animal(String name, double weight, int paws, boolean isFemale) {
        this.name = name;
        this.weight = weight;
        this.paws = paws;
        this.isFemale = isFemale;
    }


    public void eating() {
        System.out.println("I take some food");
    }

    public void drinking() {
        System.out.println("I drinking a wather");
    }

    public void sound() {
        System.out.println("I make some noise");
    }

    public void move() {
        System.out.println("I can run");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", paws=" + paws +
                ", isFemale=" + isFemale +
                '}';
    }
}
