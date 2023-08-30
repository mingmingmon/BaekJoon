package BaekJoon.Silver.S1;
import java.util.*;

public class S1_1697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] visited = new int[1000001];
        Arrays.fill(visited, -1);
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        visited[n] = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr == k) {
                System.out.println(visited[curr]);
                return;
            }
            for(int a : new int[] {curr - 1, curr + 1, curr * 2}){
                if(a < 0 || a >= 100001)
                    continue;
                if(visited[a] != -1)
                    continue;
                q.offer(a);
                visited[a] = visited[curr] + 1;
            }
        }
    }
}
