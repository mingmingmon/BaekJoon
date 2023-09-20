package BaekJoon.Bronze.B1;
import java.util.*;
import java.io.*;
public class B1_1526 {
    public static boolean isMadeByFourOrSeven(int n){
        while(n != 0){
            if(n % 10 != 7 && n % 10 != 4)
                return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while(true){
            if(isMadeByFourOrSeven(n))
                break;
            n--;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(n));
        bw.flush();
    }
}
