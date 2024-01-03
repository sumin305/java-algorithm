package SWEA;
import java.util.*;

public class SWEA1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int c = 0; c < T; c ++) {
            int N = sc.nextInt();
            String[] result = new String[N];
            Arrays.fill(result, "");
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i ++) {
                for (int j = 0; j < N; j ++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // 3번씩 돌린다
            for (int k = 0; k < 3; k ++) {
                int[][] temp = new int[N][N];
                for (int i = 0; i < N; i ++) {
                    for (int j = 0; j < N; j ++) {
                        temp[j][i] = arr[i][j];
                    }
                }
                for (int i = 0; i < N; i ++) {
                    for (int j = 0; j < N/2; j ++) {
                        int tmp = temp[i][j];
                        temp[i][j] = temp[i][N- j - 1];
                        temp[i][N- j - 1] = tmp;
                    }
                }
                arr = temp;
                for (int i = 0; i < N; i ++) {
                    for (int j = 0; j < N; j ++) {
                        result[i] += arr[i][j];
                    }
                }
                for (int i = 0; i < N; i ++) {
                    result[i] +=" ";
                }
            }
            System.out.println("# " + (c + 1));
            for (int i = 0; i < N; i ++) {
                System.out.println(result[i]);
            }
        }
    }
}
