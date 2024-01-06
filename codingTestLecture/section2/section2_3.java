package codingTestLecture.section2;
import java.util.*;
public class section2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i ++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i ++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i ++) {
            Character result = ' ';
            if (A[i] == B[i]) { // 비겼을 경우
                result = 'D';
            } else if ((A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)) { // A가 이기는 경우
                result = 'A';
            } else {
                result = 'B';
            }
            System.out.println(result);
        }
    }
}
