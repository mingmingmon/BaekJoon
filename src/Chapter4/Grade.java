package Chapter4;
import java.util.Scanner;
public class Grade {
    int grade1, grade2, grade3;
    Grade(int grade1, int grade2, int grade3){
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    double average(){
        return (grade1+grade2+grade3)/3;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Grade mygrade = new Grade(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println(mygrade.average());
    }
}
