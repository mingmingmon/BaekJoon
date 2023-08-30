package BaekJoon.Silver.S1;
import java.util.*;

public class S1_2667 {
    static class Coordinate{
        int x;
        int y;
        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int BFS(int n, int[][] town, int i, int j){
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        int numberOfHouse = 1;
        Queue<Coordinate> q = new LinkedList<>();
        q.offer(new Coordinate(i,j));
        town[i][j] = 0;
        while(!q.isEmpty()){
            Coordinate curr = q.poll();
            int x = curr.x;
            int y = curr.y;
            for (int k = 0; k < 4; k++) {
                int nx = x + dr[k];
                int ny = y + dc[k];
                if(nx < 0 || ny < 0 || nx >= n || ny >= n)
                    continue;
                if(town[nx][ny] == 0)
                    continue;
                q.offer(new Coordinate(nx,ny));
                town[nx][ny] = 0;
                numberOfHouse++;
            }
        }
        return numberOfHouse;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] town = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                town[i][j] = line.charAt(j) - '0';
            }
        }
        ArrayList<Integer> bundle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(town[i][j] == 0)
                    continue;
                bundle.add(BFS(n, town, i, j));
            }
        }
        Collections.sort(bundle);
        int l = bundle.size();
        System.out.println(l);
        for (int i = 0; i < l; i++) {
            System.out.println(bundle.get(i));
        }
    }
}
