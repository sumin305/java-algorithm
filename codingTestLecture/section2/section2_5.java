package codingTestLecture.section2;
import java.util.*;
public class section2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] check = new int[N+1];
        for (int i = 2; i <= N; i++) {
            if (check[i] == 0) {
                for (int j = 1; j * i <= N; j ++) {
                    check[j * i] ++;
                }
                count ++;
            }
        }
        System.out.println(count);
    }
}
