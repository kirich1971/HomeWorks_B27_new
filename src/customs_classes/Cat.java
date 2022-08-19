package customs_classes;

public class Cat {

    String breed;
    String name;
    double age;
    String color;
    char gender;
    boolean isVaccinated;


    public Cat  (String catBreed, String catName, double catAge, String catColor, char catGender) {
        breed = catBreed;
        name = catName;
        age = catAge;
        color = catColor;
        gender = catGender;
    }


    public Cat  (String catBreed, String catName, String catColor, char catGender) {
        age = 0.1;
        breed = catBreed;
        name = catName;
        color = catColor;
        gender = catGender;
    }


    public Cat (String catName) {
        name = catName;
        breed = "unknown";
        age = -1;
        color = "unknown";
        gender = 'F';

    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + (gender == 'F' ? "female" : "male") +
                ", " + (isVaccinated ? "vaccinated" : "non vaccinated") +
                '}';
    }
}
