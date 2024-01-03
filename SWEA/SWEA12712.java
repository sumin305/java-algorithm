package SWEA;
import java.util.Scanner;

public class SWEA12712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int k = 0; k < T; k ++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] intArray = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j ++) {
                    intArray[i][j] = sc.nextInt();
                }
            }

            int a = intArray[N/2][N/2], b = intArray[N/2][N/2];

            // + 형태
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            for (int i = 0; i < 4; i++) {
                int locX = N / 2, locY = N / 2;
                for (int cnt = 1; cnt <= M; cnt ++) {
                    locX += dx[i];
                    locY += dy[i];

                    if (locX >= 0 && locX < N && locY >= 0 && locY < N) {
                        a += intArray[locX][locY];
                    }
                }
            }

            // x 형태
            dx = new int[]{1, -1, -1, 1};
            dy = new int[]{1, 1, -1, -1};

            for (int i = 0; i < 4; i++) {
                int locX = N / 2, locY = N / 2;
                for (int cnt = 0; cnt < M; cnt ++) {
                    locX += dx[i];
                    locY += dy[i];

                    if (locX >= 0 && locX < N && locY >= 0 && locY < N) {
                        b += intArray[locX][locY];
                    }
                }
            }

            System.out.println("#" + (k+1) + " " + Math.max(a, b));
        }
    }

}
