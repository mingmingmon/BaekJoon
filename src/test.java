import javax.swing.text.html.HTMLEditorKit;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int [3][3];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j<array[i].length;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        for(int[] k : array) {
            for(int j : k) {
                System.out.println(j);
            }
        }
    }
}