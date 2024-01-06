package codingTestLecture.section2;
import java.util.*;
public class section2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][5];
        ArrayList<Set<Integer>> friends = new ArrayList<>();
        int max = 0;
        int result = 1;
        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < 5; j ++) {
                arr[i][j] = sc.nextInt();
            }
            friends.add(new HashSet<Integer>());
        }
        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < 5; j ++) {
                for (int k = 0; k < N; k ++) {
                    if (i == k) continue;
                    if (arr[i][j] == arr[k][j]) {
                        friends.get(i).add(k);
                    }
                }
            }
        }
        for (int i = 0; i < N; i ++) {
            int temp = friends.get(i).size();
            if (temp > max) {
                result = i+1;
                max = temp;
            }
        }
        System.out.println(result);
    }
}
