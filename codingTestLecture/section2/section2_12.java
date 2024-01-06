package codingTestLecture.section2;
import java.util.*;
public class section2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int result[][] = new int[N+1][N+1];
        int students[][] = new int[M][N];
        int count = 0;
        for (int i = 0; i < M; i ++) {
            for (int j = 0; j < N; j ++) {
                students[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < M; i ++) {
            for (int j = 0; j < N; j ++) {
                for (int k = j + 1; k < N; k ++) {
                    result[students[i][j]][students[i][k]] ++;
                }
            }
        }

        for (int i = 0; i <= N; i ++) {
            for (int j = 0; j <= N; j ++) {
                if (result[i][j] >= M) count ++;
            }
        }
        System.out.println(count);
    }
}
