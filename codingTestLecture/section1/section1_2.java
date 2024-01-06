package codingTestLecture.section1;
import java.util.*;


public class section1_2 {
    public String solution(String str) {

        String result = "";
        // 내장 함수 이용
//		for(char x: str.toCharArray()) {
//			if(Character.isLowerCase(x)) result += Character.toUpperCase(x);
//			else result += Character.toLowerCase(x);
//		}

        // 아스키코드 이용
        for(char x: str.toCharArray()) {
            if(x>=65 && x<=90) result += (char)(x + 32);
            else result += (char)(x - 32);

        }
        return result;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        section1_2 t = new section1_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(t.solution(str));
    }
}