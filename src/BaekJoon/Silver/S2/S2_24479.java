package BaekJoon.Silver.S2;
import java.util.*;

public class S2_24479 {
    static void DFS(int[][] graph, boolean[] visited, int n, int startV, int order, int[] result){
        result[startV] = order++;
        visited[startV] = true;
        for (int i = 1; i < n; i++) {
            if(graph[startV][i] == 0)
                continue;
            if(visited[i])
                continue;
            DFS(graph, visited, n, i, order, result);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int startV = scanner.nextInt();
        int[][] graph = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            graph[start][end] = 1;
            graph[end][start] = 1;
        }
        boolean[] visited = new boolean[n+1];
        int[] result = new int[n+1];
        int order = 1;
        DFS(graph, visited, n, startV, order, result);
        for (int i = 1; i < n+1; i++) {
            System.out.println(result[i]);
        }
    }
}
