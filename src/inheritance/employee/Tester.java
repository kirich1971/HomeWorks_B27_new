package inheritance.employee;

public class Tester extends  Employee {

    /*
- Tester class inherits Employee class
- create additional variables:
    bugs found
- create method:
    test()
        Example output: prints Running the regression
 */

    int bugsFound;


    public Tester(String name, boolean isFullTime, double salary, int bugsFound) {
        super(name, isFullTime, salary);
        this.bugsFound = bugsFound;
    }

    public void test() {
        System.out.println("Running the regression");
    }

    @Override
    public String toString() {
        return "Tester {" +
                "name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                ", bugsFound=" + bugsFound +
                '}';
    }
}
