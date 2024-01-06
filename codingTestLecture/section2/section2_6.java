package codingTestLecture.section2;
import java.util.*;
public class section2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i ++) {
            String rev_s = new StringBuilder(sc.next()).reverse().toString();
            int target = Integer.parseInt(rev_s);
            if (isPrime(target)) System.out.print(target + " ");
        }
    }

    public static boolean isPrime(int n) {
        int i = 2;
        if (n <= 1) return false;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i ++;
        }
        return true;
    }
}
