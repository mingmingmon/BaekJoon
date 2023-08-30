package BaekJoon.Silver.S2;
import java.util.*;

public class S2_11724 {
    static void BFS(int[][] graph, int startVertex, int[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.offer(startVertex);
        visited[startVertex] = 1;
        int n = graph.length;
        while(!q.isEmpty()){
            int curr = q.poll();
            for (int i = 1; i < n; i++) {
                if(graph[curr][i] == 0)
                    continue;
                if(visited[i] == 1)
                    continue;
                q.offer(i);
                visited[i] = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertex = scanner.nextInt();
        int edge = scanner.nextInt();
        int[][] graph = new int[vertex + 1][vertex + 1];
        for (int i = 0; i < edge; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            graph[start][end] = 1;
            graph[end][start] = 1;
        }

        int[] visited = new int[vertex + 1];
        int result = 0;
        for(int i = 1; i < vertex + 1; i++){
            if(visited[i] == 1)
                continue;
            BFS(graph, i, visited);
            result++;
        }
        System.out.println(result);
    }
}



