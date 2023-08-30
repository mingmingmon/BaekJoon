package BaekJoon.Silver.S2;
import java.util.*;

public class S2_11279 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int curr = scanner.nextInt();
            if(curr == 0){
                if(!maxHeap.isEmpty())
                    System.out.println(maxHeap.poll());
                else
                    System.out.println(0);
            }
            else{
                maxHeap.add(curr);
            }
        }
    }
}




