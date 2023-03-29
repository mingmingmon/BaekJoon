package BaekJoon.Bronze;

import java.util.Scanner;
//공백없이 주어진 수를 분리하고 더한다.
//string으로 받아서 분리하고 문자 배열에 저장한 다음 (int)형 변환?
public class Bronze11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String inputNumbers = scanner.next();//문자열로 입력받고//n 입력받을 때 공백문자나 enter가 버퍼에 남은 게 여기서 오류가 될 수 있다.
        //nextLine과 next의 차이를 잘 알아야 된다. 그것땜에 오류가 많이 났다.
        char[] arr = inputNumbers.toCharArray();//문자배열로 변환
        int sum = 0;
        int[] numbersArray = new int[n];
        //System.out.println(numbersArray.length);
        for (int i = 0; i < numbersArray.length; i++) {
            //numbersArray[i] = (int)arr[i]; 이건 문자 를 아스키코드로 바꾼 것
            numbersArray[i] = Character.getNumericValue(arr[i]);//이게 문자를 숫자로 바꾼 것. 또는 문자 1의 아스키 코드에서 '0' 아스키코드를 빼주면 돼
            //System.out.println(numbersArray[i]);
            sum = sum + numbersArray[i];
       }
        System.out.println(sum);
    }
}
