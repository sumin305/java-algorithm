package practice;

public class MethodValue0 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // num1의 값 5를 읽고 복사해서 값을 넣는다.
        num2 = 10;
        System.out.println(num1);
        System.out.println(num2);
    }
}
