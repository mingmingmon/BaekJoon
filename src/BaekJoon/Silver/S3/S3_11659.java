package BaekJoon.Silver.S3;
import java.util.*;
import java.io.*;
public class S3_11659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int tc = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int curr = Integer.parseInt(st.nextToken());
            sum[i] = curr + sum[i-1];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(tc-- > 0){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int result = sum[end] - sum[start - 1];
            bw.write(result + "\n");
            bw.flush();
        }
    }
}