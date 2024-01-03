package codingTestLecture;
import java.util.*;
public class section1_1 {
    public int solution(String str, char target) {
        int answer = 0;
        str = str.toUpperCase();
        target = Character.toUpperCase(target);
        for(int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == target) {
                answer += 1;
            }
        }
        // 향상된 for문 -> 배열, collection 프레임워크 등만 가능
        for(char x: str.toCharArray()) {
            if(x == target) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        section1_1 T = new section1_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열 입력받기
        char target = sc.next().charAt(0); // 문자 입력받기

        System.out.println(T.solution(str, target));
    }
}
