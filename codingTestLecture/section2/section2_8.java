package codingTestLecture.section2;
import java.util.*;
public class section2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < N; i ++) {
            int n = sc.nextInt();
            arr[i] = n;
            temp.add(n);
        }

        Collections.sort(temp, Collections.reverseOrder());
        for (int i = 0; i < N; i ++) {
            System.out.print((temp.indexOf(arr[i]) + 1) + " ");
        }
    }
}
