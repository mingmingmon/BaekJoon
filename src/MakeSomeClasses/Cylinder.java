package MakeSomeClasses;
import java.util.Scanner;
public class Cylinder {
    public static class Circle {
        public double radius;
        public static double PI = 3.141592;
        public Circle(double radious) {
            this.radius = radius;
        }
        public double getArea() {
            return radius*radius*PI;
        }
    }
    double height;
    Circle underside;
    public Cylinder(Circle underside, double height) {
        this.underside = underside;
        this.height = height;
    }

    public double getVolume(){
        return this.underside.getArea()*height;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radious = scanner.nextDouble();
        //Circle underside = new Circle(radious);
        //System.out.println(underside.getArea());
        Cylinder a = new Cylinder(new Circle(radious), scanner.nextDouble());
        System.out.println(a.getVolume());
    }
}
