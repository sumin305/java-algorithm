package codingTestLecture.section1;

import java.util.Scanner;

public class section1_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
// case1
//		int lt = 0, rt = str.length()-1;
//		while (lt < rt) {
//			if (str.charAt(rt) != str.charAt(lt)) {
//				System.out.println("NO");
//				return;
//			}
//			lt ++;
//			rt --;
// 		}
//		System.out.println("YES");


// case2
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
