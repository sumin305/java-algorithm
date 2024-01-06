package codingTestLecture.section2;
import java.util.*;
public class section2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        int result = 0;
        // 이차원 배열 입력받기
        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < N; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 행 합 비교
        for (int i = 0; i < N; i ++) {
            int sum = 0;
            for (int j = 0; j < N; j ++) {
                sum += arr[i][j];
            }
            result = Integer.max(result, sum);
        }

        // 열 합 비교
        for (int i = 0; i < N; i ++) {
            int sum = 0;
            for (int j = 0; j < N; j ++) {
                sum += arr[j][i];
            }
            result = Integer.max(result, sum);
        }

        // 두 대각선 비교
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < N; i ++) {
            sum1 += arr[i][i];
            sum2 += arr[i][N-i-1];
        }
        result = Integer.max(result, sum1);
        result = Integer.max(result, sum2);
        System.out.println(result);
    }
}
