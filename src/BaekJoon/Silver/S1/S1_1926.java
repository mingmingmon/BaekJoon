package BaekJoon.Silver.S1;

import java.util.*;
public class S1_1926 {
    static int[] dirRow = {-1, 0, 1, 0};
    static int[] dirCol = {0, 1, 0, -1};
    public static int BFS(int[][] paper, int row, int col, int i, int j){
        int area = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        paper[i][j] = 0;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            area++;
            int currRow = curr[0];
            int currCol = curr[1];
            for (int k = 0; k < 4; k++) {
                int nextRow = currRow + dirRow[k];
                int nextCol = currCol + dirCol[k];
                if(nextRow < 0 || nextCol < 0 || nextRow >= row || nextCol >= col)
                    continue;
                if(paper[nextRow][nextCol] == 0)
                    continue;
                q.offer(new int[]{nextRow, nextCol});
                paper[nextRow][nextCol] = 0;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] paper = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                paper[i][j] = scanner.nextInt();
            }
        }

        int maxArea = 0;
        int area = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(paper[i][j] == 0)
                    continue;
                int currArea = BFS(paper, row, col, i, j);
                area++;
                maxArea = maxArea < currArea ? currArea : maxArea;
            }
        }

        System.out.println(area);
        System.out.println(maxArea);
    }
}
