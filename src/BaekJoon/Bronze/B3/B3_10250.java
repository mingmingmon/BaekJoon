package BaekJoon.Bronze.B3;

import java.util.*;

public class B3_10250 {
    static Scanner scanner;
    static void getRoomNumber(int height, int n){
        int Y = (n - 1) % height + 1;
        int X = (n - 1) / height + 1;
        System.out.printf("%d%02d\n", Y, X);
    }

    /*층수
    * 1,7,13-->6으로 나눴을 때 나머지 1
    * 2,8,14
    * 3,9,15
    * */

    /*호수
    1~6 n-1 / height = 0
    7~12
    13~18 */
    /* 1 -> 0 / 1 = 0
    * 2 --> 1 / 1 = 1
    *
    *
    * */
    public static void main(String[] args){
        scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        for (int i = 0; i < testcase; i++) {
            int height = scanner.nextInt();
            int width = scanner.nextInt();
            int n = scanner.nextInt();
            getRoomNumber(height, n);
        }
    }
}
