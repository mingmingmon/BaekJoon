package BaekJoon.Bronze.B3;
import java.util.*;
import java.io.*;
public class B3_4458 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            char firstLetter = line.charAt(0);
            firstLetter = (char)(firstLetter >= 'a' ? firstLetter - 'a' + 'A' : firstLetter);

            StringBuilder sb = new StringBuilder(line);
            sb.setCharAt(0,firstLetter);
            line = sb.toString();

            System.out.println(line);
        }
    }
}
