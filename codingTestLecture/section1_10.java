package codingTestLecture;

import java.util.Arrays;
import java.util.Scanner;

public class section1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        char[] s = tmp[0].toCharArray();
        String t = tmp[1];
        int[] result = new int[s.length];
        int temp = 1000;
        for (int i = 0; i < s.length; i++) {
            if (Character.toString(s[i]).equals(t)) {
                temp = 0;
            }
            result[i] = temp;
            temp += 1;
        }
        for (int i = s.length-1; i >= 0; i --) {
            if (Character.toString(s[i]).equals(t)) {
                temp = 0;
            }
            if (temp < result[i]) {
                result[i] = temp;
            }
            temp += 1;
        }
        for (int i: result) {
            System.out.print(i + " ");
        }
    }
}
