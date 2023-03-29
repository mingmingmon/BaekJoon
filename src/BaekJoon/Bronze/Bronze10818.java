package BaekJoon.Bronze;

import java.util.Scanner;
// 브론즈3 10818
// n개 정수 받아서 배열로 저장
// 최댓값 구하는 for 루프 한 번 돌고 최솟값 구하는 for 루프 한 번 돌기

public class Bronze10818 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] numbers = new int [1000000];
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        // max와 min 변수 위치 신경쓰기
        for (int i = 1; i < n; i++){
            if(max < numbers[i])
                max = numbers[i];
            if(min > numbers[i])
                min = numbers[i];
        }
        scanner.close();
        System.out.print(min + " " + max);
    }
}
