package BaekJoon.Bronze;

import java.util.Scanner;
// 브론즈5 2738
// n*m 행렬 두 개를 입력 받아서 2차원 배열에 저장한다.
// 같은 행과 열에 있은 성분들을 두 행렬에서 꺼내와서 더하고 새로운 행렬에 저장한다.
public class Bronze2738 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int [][] matrix = new int [100][100];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                matrix[i][j] += scanner.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
