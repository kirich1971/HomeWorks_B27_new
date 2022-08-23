package inheritance.employee;

public class Company {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Jay", true, 200_000, 10);
        System.out.println(dev1);
        dev1.work();
        dev1.develop();


        Tester test1 = new Tester("Iroda", false, 124000, 12);
        System.out.println(test1);
        test1.work();
        test1.test();


        Employee ceo = new Employee("Kirill", true, 450000);
        System.out.println(ceo);
        ceo.work();

    }
}
