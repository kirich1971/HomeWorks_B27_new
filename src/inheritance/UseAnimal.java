package inheritance;

public class UseAnimal {
    public static void main(String[] args) {


        Animal animal1 = new Animal("Leo One", "leon", 150, 4);

//        animal1.weight = -150;

        animal1.setWeight(150);
//        System.out.println(animal1.weight);
        System.out.println(animal1.getWeight());


        animal1.setName("Leo Two");

    }
}
