package BaekJoon.Silver.S2;
import java.util.*;
import java.io.*;
public class S2_1260 {
    static void BFS(int n, int v, int[][] graph){
        /*BFS 너비 우선 탐색. 레벨 탐색.*/
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[n+1];
        q.offer(v);
        visited[v] = 1;
        System.out.print(v + " ");
        while(!q.isEmpty()){
            int curr = q.poll();
            for (int j = 1; j < n+1; j++) {
                if(graph[curr][j] == 0)
                    continue;
                if(visited[j] == 1)
                    continue;
                q.add(j);
                visited[j] = 1;
                System.out.print(j + " ");
            }
        }
    }
    static void DFS(int n, int v, int[][] graph, int[] visited){
        visited[v] = 1;
        System.out.print(v + " ");
        for (int i = 1; i < n+1; i++) {
            if(graph[v][i] == 0)
                continue;
            if(visited[i] == 1)
                continue;
            DFS(n,i,graph,visited);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int v = scanner.nextInt();
        int[][] graph = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            graph[start][end] = 1;
            graph[end][start] = 1;
        }
        int[] visited = new int[n+1];
        DFS(n,v,graph,visited);
        System.out.println();
        BFS(n,v,graph);
    }
}
