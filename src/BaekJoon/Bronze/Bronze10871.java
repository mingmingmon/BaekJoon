package BaekJoon.Bronze;

import java.util.Scanner;
//브론즈 5 10871
//n개의 정수 입력받아서 배열로 저장하기
//x보다 작은 수를 입력받은 순서대로 공백 구분 출력

public class Bronze10871 {
    public static void main(String[] args){
        int[] numbers = new int [10000];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(numbers[i] < x)
                System.out.print(numbers[i] + " ");
        }
        scanner.close();
    }
}
