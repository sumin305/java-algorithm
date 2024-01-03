package SWEA;
import java.util.Scanner;
import java.util.Arrays;
class SWEA1959 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int max = 0;

            int[] A = new int[N];
            int[] B = new int[M];
            for (int i = 0; i < N; i ++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i ++) {
                B[i] = sc.nextInt();
            }
            if (N > M) {
                int[] tmpArray = new int[0];
                tmpArray = A;
                A = B;
                B= tmpArray;

                int tmp = N;
                N = M;
                M = tmp;
            }


            for (int i = 0; i <= (M - N); i ++) {
                int temp = 0;
                for (int j = 0; j < N; j ++) {
                    temp += (A[j] * B[i + j]);
                }
                if (temp > max) {
                    max = temp;
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}
