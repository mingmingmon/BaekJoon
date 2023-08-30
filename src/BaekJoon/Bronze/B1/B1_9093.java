package BaekJoon.Bronze.B1;
import java.util.*;
public class B1_9093 {
    static String revers(String word){
        int length = word.length();
        String result = "";
        for (int i = 0; i < length; i++) {
            result += word.charAt(length-1-i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        scanner.nextLine();
        String line = "";
        String[] words;
        for (int i = 0; i < testcase; i++) {
            line = scanner.nextLine();
            words = line.split(" ");
            /*for (int j = 0; j < words.length; j++) {
                System.out.println(words[j]);
            }*/
            for (int j = 0; j < words.length; j++) {
                System.out.print(revers(words[j]) + " ");
            }
            System.out.println("");
        }
    }
}
