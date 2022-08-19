package customs_classes;

public class SYDEO {
    public static void main(String[] args) {

        Student student1 = new Student();
//        System.out.println(student1);

        Student student2 = new Student();


        student1.ID = 1;
        student1.lastName = "Bond";
        student1.firstName = "James";
        student1.groupNumber = "B27";
        student1.isFullTime = true;
        student1.IQ = 75;
        student1.setMajor();
        student1.balanceDue = 13_000;

        System.out.println(student1);

        student1.getPayment(850);
        student1.changeGPA(13.5);
        System.out.println("Student after 1st month:\n" + student1 );

        System.out.println();

        student1.getPayment(850);
        student1.changeGPA(12.5);
        student1.changeGPA(16.5);
        System.out.println("Student after 2st month:\n" + student1 );

    }

}
