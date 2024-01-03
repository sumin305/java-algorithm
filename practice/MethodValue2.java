package practice;

public class MethodValue2 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. 함수 호출 전 num1:" + number);
        number = changeNumber(number); // main과 changeNumber 메서드의 number는 서로 다른 지역 변수임.
        System.out.println("4. 함수 호출 후 num1:" + number);
    }

    public static int changeNumber(int number) {
        System.out.println("2. 변경 전 num2:" + number);
        number *= 2;
        System.out.println("3. 변경 후 num2:" + number);
        return number;
    }
}
