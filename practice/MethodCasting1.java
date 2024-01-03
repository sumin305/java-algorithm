package practice;

public class MethodCasting1 {

    public static void main(String[] args) {
        int n = 5;
        printNumber(n); // 작은 타입 -> 큰 타입 자동 형변환 가능
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
