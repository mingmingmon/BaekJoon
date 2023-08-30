package BaekJoon.Silver.S2;
import java.util.*;

public class S2_16401 {
    static boolean isPossible(long mid, long[] cookies, int people){
        int n = cookies.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            try{
                sum += cookies[i] / mid;
            }catch (ArithmeticException e){
                return false;
            }
        }
        if(sum >= people)
            return true;
        return false;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int cookie = scanner.nextInt();
        long[] cookies = new long[cookie];
        long max = 0;
        for (int i = 0; i < cookie; i++) {
            cookies[i] = scanner.nextLong();
            max = cookies[i] > max ? cookies[i] : max;
        }
        long start = 1;
        long end = max;
        long result = 0;
        while(start <= end){
            long mid = (start + end) / 2;
            if(isPossible(mid,cookies,people)){
                start = mid + 1;
                result = mid;
            }
            else
                end = mid - 1;
        }
        System.out.println(result);
    }
}
