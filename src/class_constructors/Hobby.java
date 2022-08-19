package class_constructors;

public class Hobby {


    String name;
    double annualCost;
    boolean isOutdoors;
    boolean reqOthers;


    public Hobby(String name) {
        this.name = name;
    }


    public  Hobby(String name, double annualCost) {
        this(name);              // calling previous constructor
//        this.name = name;
        this.annualCost = annualCost;
    }


    public Hobby(String name, double annualCost, boolean isOutdoors, boolean reqOthers) {
//        this.name = name;
//        this.annualCost = annualCost;
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.reqOthers = reqOthers;
    }


    @Override
    public String toString() {
        return "class_constructors.Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", reqOthers=" + reqOthers +
                '}';
    }


    // github changes
    public void doIt() {
        if (isOutdoors) {
            System.out.println("Doing " + name + " outside");
        } else {
            System.out.println("Doing " + name + " inside");
        }
    }

}
