package BaekJoon.Bronze;

import java.util.Scanner;
// scanner로 문자를 받아서 아스키 코드로 출력
public class Bronze11654{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //next() 와 nextLine()모두 다음 토큰을 문자열로 리턴
        char c = str.charAt(0);
        int num = (int)c;
        System.out.println(num);

    }
}
