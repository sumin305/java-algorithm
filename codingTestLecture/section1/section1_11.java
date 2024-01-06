package codingTestLecture.section1;
import java.util.*;

public class section1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArray = sc.nextLine().toCharArray();
        String result = "";
        char temp = charArray[0];
        int count = 1;
        for (int i = 1; i < charArray.length; i ++) {
            if (temp != charArray[i]) {
                result += temp;
                temp = charArray[i];
                if (count > 1) {
                    result += (int)count;
                }
                count = 1;
            } else {
                count += 1;
            }
        }
        result += temp;
        if (count > 1) {
            result += (int)count;
        }
        System.out.println(result);
    }
}
