package BaekJoon.Silver.S2;
import java.util.*;

public class S2_2805 {
    static boolean isPossible(long mid, long m, long[] trees){
        long sum = 0;
        int n = trees.length;
        for (int i = 0; i < n; i++) {
            sum += (trees[i] - mid >= 0 ? trees[i] - mid : 0);
        }
        return (sum >= m ? true : false);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] trees = new long[n];
        long maxTree = 0;
        for (int i = 0; i < n; i++) {
            trees[i] = scanner.nextLong();
            maxTree = trees[i] > maxTree ? trees[i] : maxTree;
        }
        long start = 0;
        long end = maxTree;
        long answer = 0;
        while(start <= end){
            long mid = (start + end) / 2;
            if(isPossible(mid, m, trees)){
                start = mid + 1;
                answer = mid;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
