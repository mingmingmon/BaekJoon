package BaekJoon.Bronze;

import java.util.Scanner;
// 9*9 개의 정수를 2차원 배열의 형태로 입력받아서 저장
// for문을 돌면서 가장 큰 수를 찾고 그 행과 열을 i,j 변수로 기억해서 출력


public class Bronze2566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] metrix = new int[9][9];
        int max = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < 9; i++) { //?? for-each문 아직 잘 모르겠다 for-each 문으로 하니까 입력이 제대로 안 돼.
            for (int j = 0; j < 9; j++){
                //metrix[i][j] = scanner.nextInt();
                int x = scanner.nextInt();
                if (x > max) {
                    max = x;
                    a = i;
                    b = j;
                }
            }
        }
        scanner.close();
            //최대값이 두 개이면 뒤에 있는 행,열을 출력하고 max 값이 이상함.
        System.out.println(max);
        System.out.print((a+1) + " " + (b+1));


    }
}
