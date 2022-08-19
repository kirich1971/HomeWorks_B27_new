package customs_classes;

public class Student {

    int ID;
    String firstName;
    String lastName;
    String groupNumber;
    double gpa;
    boolean isFullTime;
    int IQ;
    String major;
    double balanceDue;


    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", gpa=" + gpa +
                ", isFullTime=" + isFullTime +
                ", IQ=" + IQ +
                ", major='" + major + '\'' +
                ", balanceDue=" + balanceDue +
                '}';
    }

    public void changeGPA(double change) {
        gpa += change;
    }

    public void changeGroup(String newGroup) {
        groupNumber = newGroup;
    }

    public void changeLastName(String newName) {
        lastName = newName;
    }


    public void setMajor() {
        if (groupNumber.equals("B27")) {
            major = "Java SDET";
        } else {
            major = "Java developer";
        }
    }


    public void getPayment(double payment) {
        balanceDue -= payment;
        System.out.println("we've got your payment");
    }

}
