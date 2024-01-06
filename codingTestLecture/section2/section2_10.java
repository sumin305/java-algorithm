package codingTestLecture.section2;
import java.util.*;
public class section2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N+2][N+2];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int result = 0;
        for (int i = 1; i <= N; i ++) {
            for (int j = 1; j <= N; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= N; i ++) {
            for (int j = 1; j <= N; j ++) {
                boolean isPeaks = true;
                for (int k = 0; k < 4; k ++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (arr[nx][ny] >= arr[i][j]) {
                        isPeaks = false;
                        break;
                    }
                }
                if (isPeaks) result++;
            }
        }
        System.out.println(result);
    }
}
