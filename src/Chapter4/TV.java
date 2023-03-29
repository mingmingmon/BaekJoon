package Chapter4;
import java.util.Scanner;
public class TV {
    String TVBrand;
    int year;
    int sizeofTV;
    TV(String TVBrand, int year, int sizeofTV){
        this.TVBrand = TVBrand;
        this.year = year;
        this.sizeofTV = sizeofTV;
    }
    void show() {
        System.out.println( TVBrand + "에서 만든 " + year + "년형 " + sizeofTV + "인치 TV");
    }
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
