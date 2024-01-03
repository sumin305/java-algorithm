package SWEA;
import java.util.Scanner;

public class SWEA1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] map = new int[9][9];

        for (int c = 0; c < T; c ++) {
            var result = 0;
            for (int i = 0; i < 9; i ++) {
                for (int j = 0; j < 9; j ++) {
                    map[i][j] = sc.nextInt();
                }
            }
            result = isSudoku(map) ? 1 : 0;
            System.out.println("#" + (c + 1) + " " + result);
        }
    }
    public static boolean isSudoku(int[][] map) {

        var answer = false;
        // 왼쪽 상단부터 오른쪽 하단으로 9개의 열과 행을 탐색한다.
        for (int i = 0; i < 9; i ++) {
            // 가로
            int[] temp = new int[10];
            for (int x = 0; x < 9; x ++) {
                if (temp[map[x][i]] >= 1) {
                    return false;
                }
                temp[map[x][i]] += 1;
            }

            // 세로
            temp = new int[10];
            for (int y = 0; y < 9; y ++) {
                if (temp[map[i][y]] >= 1) {
                    return false;
                }
                temp[map[i][y]] += 1;}
        }
        // 9개의 3 x 3 탐색
        for (int x = 0; x <= 6; x += 3) {
            for (int y = 0; y <= 6; y += 3) {
                int[] temp = new int[10];
                for (int i = 0; i < 3; i ++) {
                    for (int j = 0; j < 3; j ++) {
                        if (temp[map[x + i][y + j]] >= 1) {
                            return false;
                        }
                        temp[map[x + i][y + j]] += 1;
                    }
                }
            }
        }
        return true;
    }
}
