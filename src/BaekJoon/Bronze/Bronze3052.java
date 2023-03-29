package BaekJoon.Bronze;

import java.util.Scanner;
import java.util.Arrays;
public class Bronze3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt()%42;
        }
        Arrays.sort(numbers); // 정렬
        for (int i = 0; i < 9; i++) {
            if(numbers[i]!=numbers[i+1]) {
                ++cnt;
            }
        }
        System.out.println(cnt+1);
    }
}