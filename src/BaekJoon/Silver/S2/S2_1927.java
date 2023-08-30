package BaekJoon.Silver.S2;
import java.util.*;

public class S2_1927 {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int curr = scanner.nextInt();
            if(curr == 0){
                if(!minHeap.isEmpty())
                    System.out.println(minHeap.poll());
                else
                    System.out.println(0);
            }
            else{
                minHeap.add(curr);
            }
        }
    }
}

