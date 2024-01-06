package codingTestLecture.section1;
import java.util.*;

public class section1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length() - 1; i += 7) {
           char[] arr = str.substring(i, i+7).toCharArray();
           char[] bin = toBinary(arr);
           int dec = toDecimal(bin);
           result += (char)dec;
        }
        System.out.println(result);
    }

    public static char[] toBinary(char[] charArray) {
        String str = "";
        for (char s: charArray) {
            if (s == '#') {
                str += "1";
            } else {
                str += "0";
            }
        }
        return str.toCharArray();
    }

    public static int toDecimal(char[] target) {
        int bin = 0;
        for (int i = target.length-1; i >= 0; i --) {
            int a = (int) Math.pow(2, target.length-1 - i);
            bin += (a * Character.getNumericValue(target[i]));
        }
        return bin;
    }
}
