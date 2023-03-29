package MakeSomeClasses;

import java.util.Scanner;
public class Student {
    private String major;
    private int studentNumber;
    void setter(String major, int studentNumber) {
        this.major = major;
        this.studentNumber = studentNumber;
    }
    String getMajor() {
        return this.major;
    }
    int getStudentNumber() {
        return this.studentNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        String name = scanner.next();
        int studentNumber = scanner.nextInt();
        student1.setter(name,studentNumber);

        System.out.println(student1.getMajor()+student1.getStudentNumber());
    }
}
