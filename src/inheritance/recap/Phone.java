package inheritance.recap;

public class Phone {     // superclass

    String brand;
    String model;

    double price;
    int memorySize;


    public Phone() {
        this.brand = "noName";
        this.model = "noModel";
        this.price = -1;

    }


    public Phone(String model, double price, int memorySize) {
        this.model = model;
        this.price = price;
        this.memorySize = memorySize;
    }


    public Phone(String brand, String model, double price, int memorySize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memorySize = memorySize;
    }


    public void calls() {
        System.out.println("Any Phone Call phone");
    }

    public void texing() {
        System.out.println(     " Any Phone Texting"    );
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", memorySize=" + memorySize +
                '}';
    }
}



// SUBCLASS
class iPhone extends Phone {

    static String OS ;

    public iPhone() {
//        super();
        this.brand = "iPhone";
    }

    static {
        OS = "IOS";
    }

    public void calls() {
        System.out.println("Iphone calling");
    }



    @Override
    public String toString() {
        return "iPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", memorySize=" + memorySize +
                ", OperationSystem:" + OS +
                '}';
    }
}


class iPhone13 extends iPhone {

}


class AndroPhone extends  Phone {
    static String OS = "Android";
}


class RunPnone {
    public static void main(String[] args) {

        iPhone iPhone12 = new iPhone();
        System.out.println(iPhone12);
        iPhone12.calls();
        iPhone12.texing();
    }
}