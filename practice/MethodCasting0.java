package practice;

public class MethodCasting0 {

    public static void main(String[] args) {
        double n = 1.5;
        // printNumber(n); // 컴파일 에러 -> 형이 다르다.
        printNumber((int) n); // 명시적 형변환 활용
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
