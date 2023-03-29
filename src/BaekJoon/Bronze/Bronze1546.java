package BaekJoon.Bronze;

import java.util.Scanner;
//점수 중 최대값 max 에 저장 모든 점수를 점수/max*100으로 재저장
//점수를 재저장 한 후 새로운 평균 출력
//원래점수를 정수 배열에 저장하고 max를 찾은 다음 재저장하고 평균 구하기
public class Bronze1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        double sum = 0;
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for(int j : scores) {
            j = scanner.nextInt();
            System.out.println(j);
            if(max < j) {
                max = j;
            }

        }
        System.out.println(max);
        for (double k : scores) {
            //System.out.println(max);
            k = k/max*100;
            System.out.println(k);
            sum = sum + k;
        }
        double average = sum/n;
        System.out.println(average);
    }
}



