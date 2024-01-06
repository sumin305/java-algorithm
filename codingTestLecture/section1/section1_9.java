package codingTestLecture.section1;

import java.util.Scanner;

public class section1_9 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("[A-Za-z]","");
        int result = Integer.parseInt(str);
        System.out.println(result);
    }
}
