package BaekJoon.Silver.S2;
import java.util.*;

public class S2_1654 {
    static long[] cables;
    static boolean isPossibleToMakeCables(long cuttinglength, long n) {
        long result = 0;
        for (int i = 0; i < cables.length; i++)
            result += cables[i] / cuttinglength;
        if(result >= n)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        long n = scanner.nextInt();
        cables = new long[k];
        for (int i = 0; i < k; i++)
            cables[i] = scanner.nextInt();
        Arrays.sort(cables);

        long start = 1;
        long end = cables[k-1] + 1;
        while(start + 1 < end){
            long mid = (start + end) / 2;
            //System.out.printf("%d %d %d \n", start, mid, end);
            if(isPossibleToMakeCables(mid, n))
                start = mid;
            else
                end = mid;
        }
        System.out.println(start);
    }
}
/*
매개변수 탐색?
최소는 1cm씩 자르는거.
최대는 가장 작은 랜선의 길이.
자르면서 11개가 나오는지 확인함.
 */