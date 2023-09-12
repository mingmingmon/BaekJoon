package BaekJoon.Silver.S5;
import java.io.*;
import java.util.*;

class Coordinate implements Comparable<Coordinate>{
    int x;
    int y;
    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate that) {
        if(this.x != that.x)
            return (this.x - that.x);
        return(this.y - that.y);
    }
}

public class S5_11650 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int n = Integer.parseInt(s);

        Coordinate[] dots = new Coordinate[n];

        for (int i = 0; i < n; i++) {
            s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dots[i] = new Coordinate(x, y);
        }

        Arrays.sort(dots);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String result;
        for (int i = 0; i < n; i++) {
            Coordinate curr = dots[i];
            result = curr.x + " " + curr.y;
            bw.write(result + "\n");
            bw.flush();
        }
        bw.close();
    }
}
