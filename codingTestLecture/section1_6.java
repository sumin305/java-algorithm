package codingTestLecture;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class section1_6 {
    public String solution(String str) {
//		String result = "";
//		Set<Character> set = new HashSet<>();
//		for (char c: str.toCharArray()) {
//			if (set.contains(c)) {
//				continue;
//			}
//			else {
//				set.add(c);
//				result += c;
//			}
//		}

        String result = "";
        for (int i = 0; i < str.length(); i ++) {
            if (i == str.indexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        section1_6 t = new section1_6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
