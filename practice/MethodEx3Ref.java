package practice;

public class MethodEx3Ref {

    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 4000);
        balance = withdraw(balance, 15000);
        balance = withdraw(balance, 3000);
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance < amount) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        return balance;
    }
}
