package BaekJoon.Bronze;

import java.util.Scanner;
//3자리수 2개로 문제 고정. 
public class Bronze2908 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int renum1 = 0;
    int renum2 = 0;
    for (int i = 0; i < 3; i++) {
       num1 = (num1 % 10);
       renum1 += num1*(10^i);
    }

    }
}
