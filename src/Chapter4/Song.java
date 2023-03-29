package Chapter4;
import java.util.Scanner;
public class Song {
    String title;
    String artist;
    int year;
    String country;
    Song(){ //기본생성자
    };
    Song(String title, String artist, int year, String country){//모든 필드 초기화하는 생성자
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
    void show(){
        System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song mysong = new Song(scanner.next(),scanner.next(),scanner.nextInt(),scanner.next());
        mysong.show();
    }
}
