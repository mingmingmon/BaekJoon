package MakeSomeClasses;

import java.util.Scanner;
public class Account {
    private String owner;
    private long balance;
    void getOwner(String owner) {
        this.owner = owner;
    }
    void getBalance(long balance) { //잔금
        this.balance = balance;
    }
    String setOwner(){
        return this.owner;
    }
    long setBalance() {
        return this.balance;
    }
    //생성자는 초기화를 위한 메소드이므로 getter만 적용.
    Account() {
    }
    Account(String owner) {
        this.owner = owner;
    }
    Account(long balance) {
        this.balance = balance;
    }
    Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public long deposite(long amount) { //저축
        balance = balance + amount;
        return balance;
    }
    public long withdraw(long amount) { //인출
        if(balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
        else {
            balance = balance - amount;
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account player = new Account("전민주", 10000);
        //long amount = scanner.nextLong();

        //player.deposite(amount);
        player.withdraw(12000);
        System.out.println(player.balance);
    }
}
