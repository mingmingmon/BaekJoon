package BaekJoon.Bronze.B1;
import java.util.*;

public class B1_1259 {
    static String reverse(String number){
        String result = "";
        for(int i = number.length()-1; i >=0 ; i--){
            result += number.charAt(i);
        }
        return result;
    }
    static void checkPalindromeNumber(){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        while(!number.equals("0")){
            if(number.equals(reverse(number)))
                System.out.println("yes");
            else
                System.out.println("no");
            number = scanner.next();
        }
    }
    public static void main(String[] args){
        checkPalindromeNumber();
    }
}
