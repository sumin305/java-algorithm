package codingTestLecture;
import java.util.*;

public class section1_3 {

    public String solution(String str) {
// solution 1
        String temp = "";
        String max = "";

        for(char s: str.toCharArray()) {
            if(Character.isSpaceChar(s)) {
                if(temp.length() > max.length()) {
                    max = temp;
                }
                temp = "";
            }
            else {
                temp += s;
            }
        }

        if(temp.length() > max.length()) {
            max = temp;
        }

// solution 2

        String[] s = str.split(" ");
        for(String tmp: s) {
            if(temp.length() > max.length()) {
                max = tmp;
            }
        }

// solution 3
        int pos;

        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            if(tmp.length() > max.length()) {
                max = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()> max.length()) max = str;
        return max;
    }

    public static void main(String[] args) {
        section1_3 t = new section1_3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(t.solution(str));
    }
}
