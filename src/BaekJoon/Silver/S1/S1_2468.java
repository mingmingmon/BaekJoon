package BaekJoon.Silver.S1;
import java.util.*;

public class S1_2468 {
    static class Coordinate{
        int x;
        int y;
        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int BFS(int n, int[][] area, int rain, boolean[][] visited){
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        Queue<Coordinate> q = new LinkedList<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (area[i][j] <= rain)
                    continue;
                if(visited[i][j] == true)
                    continue;
                q.offer(new Coordinate(i,j));
                visited[i][j] = true;
                result++;
                //System.out.println("point" + i + "," + j);
                while(!q.isEmpty()){
                    Coordinate curr = q.poll();
                    int x = curr.x;
                    int y = curr.y;
                    //System.out.println("curr" + x + "," + y);
                    for (int k = 0; k < 4; k++) {
                        int nx = x + dr[k];
                        int ny = y + dc[k];
                        if(nx < 0 || ny < 0 || nx >= n || ny >= n)
                            continue;
                        if(area[nx][ny] <= rain || visited[nx][ny] == true)
                            continue;
                        q.offer(new Coordinate(nx, ny));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] area = new int[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                area[i][j] = scanner.nextInt();
                max = area[i][j] > max ? area[i][j] : max;
            }
        }
        boolean[][] visited = new boolean[n][n];
        int result = 0;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(visited[j],false);
            }
            int curr = BFS(n, area, i, visited);
            //System.out.println(curr);
            result = curr > result ? curr : result;
        }
        System.out.println(result);
    }
}
