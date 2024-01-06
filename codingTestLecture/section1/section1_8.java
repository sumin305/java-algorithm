package codingTestLecture.section1;

import java.util.Scanner;

public class section1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 모두 대문자로 변경 후 알파벳이 아닌 문자 ""로 변경
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
