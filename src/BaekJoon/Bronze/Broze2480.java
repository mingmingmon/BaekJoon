package BaekJoon.Bronze;

import java.util.Scanner;
import java.util.Arrays;
//입력받은 수를 저장할 공간. 배열
//for 문 돌면서 숫자 비교.
public class Broze2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        int price = 0;
        for(int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums); //배열을 오름차순으로 정렬 작은 것 부터 큰 것
        if(nums[0]==nums[1]&&nums[1]==nums[2]) {
            price = 10000+nums[0]*1000;
        }
        else if(nums[0]==nums[1]||nums[1]==nums[2]) { //위의 if에서 자명히 틀린 조건은 쓸 필요가 없다.
            // ex) nums[1]!=nums[2]
            price = 1000+nums[1]*100;
        }
        else {
            price = nums[2]*100;
        }
        System.out.println(price);
    }
}
