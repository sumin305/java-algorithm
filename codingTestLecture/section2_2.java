package codingTestLecture;
import java.util.*;
public class section2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        String[] arr = sc.nextLine().split(" ");
        int max = Integer.parseInt(arr[0]);
        int count = 1;
        for (int i = 1; i < arr.length; i ++) {
            int temp = Integer.parseInt(arr[i]);
            if (temp > max) {
                max = temp;
                count += 1;
            }
        }
        System.out.println(count);
    }
}
