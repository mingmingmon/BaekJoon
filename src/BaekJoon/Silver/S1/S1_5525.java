package BaekJoon.Silver.S1;
import java.util.*;

public class S1_5525 {
    static boolean isPossible(String string, int index, int n){
        int size = string.length();
        int p = index + 2 * n;
        int m = p > size ? size : p;
        int cnt = 0;
        for (int i = index; i < m - 1; i++) {
            cnt++;
            if(string.charAt(i) == string.charAt(i+1))
                return false;
        }
        if(cnt < 2 * n - 1)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //o 개수
        int m = scanner.nextInt();
        String string = scanner.next();
        int result = 0;
        for (int i = 0; i < m; i++) {
            if(string.charAt(i) == 'I' && isPossible(string, i, n)){
                result++;
            }

        }
        System.out.println(result);
    }
}
/*
n이 1이면 3 = 1 + 2
n이 2이면 5 = 2 + 3
n이 3이면 7 = 3 + 4
* */