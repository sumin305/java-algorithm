package codingTestLecture.section1;
import java.util.*;

public class section1_4 {

    public ArrayList<String> solution(int n, String[] strArray) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x: strArray) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt += 1;
                rt -= 1;
            }
            String newStr = String.valueOf(s);
            answer.add(newStr);
        }
        return answer;
    }

    public static void main(String[] args) {
        section1_4 T = new section1_4();
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        String[] strArray = new String[c]; // 문자열 입력받기

        for (int i = 0; i < c; i++) {
            strArray[i] = sc.next();
        }

        for (String x: T.solution(c, strArray)) {
            System.out.println(x);
        }
    }
}
