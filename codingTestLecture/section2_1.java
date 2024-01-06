package codingTestLecture;
import java.util.Arrays;
import java.util.Scanner;

public class section2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i ++) {
            if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i-1])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
