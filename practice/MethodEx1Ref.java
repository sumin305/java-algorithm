package practice;

public class MethodEx1Ref {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.println(average(a, b, c));
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}
