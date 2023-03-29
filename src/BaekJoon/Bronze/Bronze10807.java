package BaekJoon.Bronze;

import java.util.Scanner;
// 브론즈5 10807번
// n개의 정수 입력받아서 배열에 저장하기
// 배열 돌면서 v가 몇 개인지 세기

public class Bronze10807 {
    public static void main(String[] args) {
        int sum = 0;
        int numbers []= new int[100];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int v = scanner.nextInt();
        for(int i = 0; i < n; i++){
            if(v == numbers[i]){
                sum = sum+1;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
