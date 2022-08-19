package customs_classes;


public class RectangleWorking {
    public static void main(String[] args) {


        Rectangle rec1 = new Rectangle();
        System.out.println(rec1);


        rec1.height = 20.0;
        rec1.base = 10.0;

        rec1.x = 5;
        rec1.y = 12;

        System.out.println(rec1);

        rec1.calculatePerimeter();
        System.out.println(rec1);

        rec1.calculateArea();
        System.out.println(rec1);


    }

}
