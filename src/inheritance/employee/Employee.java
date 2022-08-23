package inheritance.employee;

public class Employee {
    /*
	- create variables:
		name, is full time, salary
	- create method:
		work()
			Example output: prints $name is working
     */

    String name;
    boolean isFullTime;
    double salary;

    public void work() {
        System.out.println(name + " is working");
    }


    public Employee(String name, boolean isFullTime, double salary) {
        this.name = name;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
