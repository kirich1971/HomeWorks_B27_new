package customs_classes;

public class CarObjectCreating {

    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);

        car1.model = "BMW";
        car1.color = "red";
        car1.year  = 2022;
        car1.fuelLevel = 50;
        System.out.println(car1);

        car1.drive();
        System.out.println(car1);

        for (int i = 0; i < 6; i++) {
            car1.drive();
        }
        System.out.println(car1);

        System.out.println("Is my tank has low level: " + car1.isLow());

        car1.fillTank();
        System.out.println(car1);

        car1.drive(37);

        System.out.println(car1);

        car1.addGas(100 - car1.fuelLevel);

        car1.changeColor("green");
        System.out.println(car1);


    }
}
