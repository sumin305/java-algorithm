package practice;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println(add(3, 4));
        System.out.println(add(3, 4, 5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
