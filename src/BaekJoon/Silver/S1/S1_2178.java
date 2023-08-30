package BaekJoon.Silver.S1;
import java.util.*;

public class S1_2178 {
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static class Coordinate{
        int x;
        int y;
        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void BFS(int n, int m, int[][] maze, int[][] map, boolean[][] visited){
        Queue<Coordinate> q = new LinkedList<>();
        q.offer(new Coordinate(0,0));
        map[0][0] = 1;
        visited[0][0] = true;
        while(!q.isEmpty()){
            Coordinate curr = q.poll();
            int x = curr.x;
            int y = curr.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dr[i];
                int ny = y + dc[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;
                if(maze[nx][ny] == 0)
                    continue;
                if(visited[nx][ny])
                    continue;
                q.offer(new Coordinate(nx, ny));
                visited[nx][ny] = true;
                map[nx][ny] = map[x][y] + 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }
        boolean[][] visited = new boolean[n][m];
        int[][] map = new int[n][m];
        BFS(n, m, maze, map, visited);
        System.out.println(map[n-1][m-1]);
    }
}
