package BaekJoon.Silver.S5;
import java.util.*;
import java.io.*;

class Member implements Comparable<Member>{
    int age;
    String name;
    int order;

    Member(int age, String name, int order){
        this.age = age;
        this.name = name;
        this.order = order;
    }

    @Override
    public int compareTo(Member that) {
        if(this.age != that.age)
            return (this.age - that.age);
        return(this.order - that.order);
    }
}
public class S5_10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        Member[] members = new Member[n];
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age, name, i);
        }

        Arrays.sort(members);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            Member curr = members[i];
            String result = curr.age + " " + curr.name + "\n";
            bw.write(result);
            bw.flush();
        }
    }
}
