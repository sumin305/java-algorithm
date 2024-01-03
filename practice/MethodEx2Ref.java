package practice;

public class MethodEx2Ref {

    public static void main(String[] args) {
        printMessage("HELLO SSAFY", 6);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i ++) {
            System.out.println(message);
        }
    }
}
