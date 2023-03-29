package MakeSomeClasses;

public class Computer {
    public final String[] osType = {"윈도우7", "애플", "안드로이드"};
    int sizeOfMainMemory;
    String Type;
    Computer(int i ,int sizeOfMainMemory){
        this.Type = osType[i];
        this.sizeOfMainMemory = sizeOfMainMemory;
    }
    public void print(){
        System.out.println("운영체제: " + Type + "," + "메인메모리: " + sizeOfMainMemory);
    }
    public static void main(String[] args) {
        Computer pc = new Computer(0,16);
        Computer apple = new Computer(1,32);
        Computer galaxy = new Computer(2,16);
        pc.print();
        apple.print();
        galaxy.print();
    }
}
