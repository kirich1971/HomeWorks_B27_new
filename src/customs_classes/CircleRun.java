package customs_classes;

import java.util.ArrayList;

public class CircleRun {
    public static void main(String[] args) {

        Circle      c1    =      new         Circle();
        System.out.println(c1);


//        c1.radius = 10;
//        System.out.println(c1);


//        Circle c2 = new Circle();
//        c2.radius = 5;
//        c2.x = 10;
//        c2.y = 20;
//        System.out.println(c2);


        //         equal

        Circle c2 = new Circle(5, 10, 20);
        System.out.println(c2);



        Circle c3 = new Circle(15, 25);
        System.out.println(c3);


//
//
//        Circle c3 = new Circle();
//        c3.radius = 15;
//        c3.x = 20;
//        c3.y = 10;
//        System.out.println(c3);
//


        ArrayList list1 = new ArrayList<>();


        ArrayList list2 = new ArrayList<>(list1);





    }
}
