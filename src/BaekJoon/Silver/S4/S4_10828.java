package BaekJoon.Silver.S4;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class S4_10828 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if(command.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
                continue;
            }
            if(command.equals("pop")){
                int number = 0;
                if(stack.empty())
                    number = -1;
                else
                    number = stack.pop();
                bw.write(number + "\n");
                continue;
            }
            if(command.equals("top")){
                int number = 0;
                if(stack.empty())
                    number = -1;
                else
                    number = stack.peek();
                bw.write(number + "\n");
                continue;
            }
            if(command.equals("size")){
                bw.write(stack.size() + "\n");
                continue;
            }
            if(command.equals("empty")){
                int number = stack.empty() ? 1 : 0;
                bw.write(number + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
