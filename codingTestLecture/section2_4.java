package codingTestLecture;
import java.util.*;
public class section2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] result = new int[N];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i < N; i ++) {
            result[i] = result[i-1] + result[i-2];
        }
        for (int i = 0; i < N; i ++) {
            System.out.print(result[i] + " ");
        }
    }
}
