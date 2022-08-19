package customs_classes;

public class Circle {

    double radius;
    int x;
    int y;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }


    public Circle() {
        radius = 1;
    }


    public Circle (double rad, int xx, int yy) {
        radius = rad;
        x = xx;
        y = yy;
    }


    public Circle (int xx, int yy) {
        radius = 100;
        x = xx;
        y = yy;
    }




}
