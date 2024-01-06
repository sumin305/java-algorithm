package codingTestLecture;
import java.util.*;
public class section2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= N; i++) {
            if (isPrimeNumber(i)) {
                count += 1;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrimeNumber(int n) {
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i += 1;
        }
        return true;
    }
}
