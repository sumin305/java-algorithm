package codingTestLecture.section2;
import java.util.*;
public class section2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int score = 0;
        for (int i = 0; i < N; i ++) {
            int n = sc.nextInt();
            if (n == 1) {
                count ++;
                score += count;
            } else {
                count = 0;
            }
        }
        score += count;
        System.out.println(score);
    }
}
