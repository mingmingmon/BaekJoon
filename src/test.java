import java.util.*;
class test {
    static public String solution(String input_string) {
        String answer = "";
        int[] alphabet = new int[26];
        int n = input_string.length();
        input_string += ' ';
        for(int i = 0; i < n; i++){
            if(input_string.charAt(i) != input_string.charAt(i + 1))
                alphabet[input_string.charAt(i) -'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(alphabet[i] >= 2)
                answer += (char)(i + 'a');
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(solution("edeaaabbccd"));
    }
}