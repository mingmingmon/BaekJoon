package BaekJoon.Silver.S2;
import java.util.*;

public class S2_1012 {
    static class Coordinate{
        int x;
        int y;
        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static void BFS(int row, int col, int[][] map, int j, int k){
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        Queue<Coordinate> q = new LinkedList<>();
        q.offer(new Coordinate(j,k));
        map[j][k] = 0;
        while(!q.isEmpty()){
            Coordinate curr = q.poll();
            int x = curr.x;
            int y = curr.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dr[i];
                int ny = y + dc[i];
                if(nx < 0 || ny < 0 || nx >= row || ny >= col)
                    continue;
                if(map[nx][ny] == 0)
                    continue;
                q.offer(new Coordinate(nx, ny));
                map[nx][ny] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int i = 0; i < tc; i++) {
            int col = scanner.nextInt();
            int row = scanner.nextInt();
            int[][] map = new int[row][col];
            int cabbage = scanner.nextInt();
            for (int j = 0; j < cabbage; j++) {
                int c = scanner.nextInt();
                int r = scanner.nextInt();
                map[r][c] = 1;
            }
            int result = 0;
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if(map[j][k] == 0)
                        continue;
                    BFS(row, col, map, j, k);
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
