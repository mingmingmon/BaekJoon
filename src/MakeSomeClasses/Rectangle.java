package MakeSomeClasses;

import java.util.Scanner;
public class Rectangle {
    double width;
    double height;
    Rectangle(){

    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width*this.height;
    }
    public double getCircumference() {
        return (this.width+this.height)*2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rc = new Rectangle(scanner.nextDouble(),scanner.nextDouble());
        System.out.println("면적은 " + rc.getArea());
        System.out.println("둘레은 " + rc.getCircumference());
    }
}
