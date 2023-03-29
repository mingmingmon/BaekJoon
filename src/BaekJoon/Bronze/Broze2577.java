package BaekJoon.Bronze;

import java.util.Scanner;
public class Broze2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        for(int i = 0; i < 3; i++) {
            result *= scanner.nextInt();
        }
        int[] resultArr = new int[10];
        while(result > 0) {
            ++resultArr[result % 10];
            result = result / 10;
        }
        for(int k : resultArr) {
            System.out.println(k);
        }
    }
}


