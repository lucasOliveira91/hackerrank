import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A =sc.next();
        String B =sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int lenghtSum = A.length() + B.length();

        StringBuilder sbA= new StringBuilder(A);
        StringBuilder sbB= new StringBuilder(B);
        sbA.replace(0,1, A.split("")[0].toUpperCase());
        sbB.replace(0,1, B.split("")[0].toUpperCase());

        System.out.println(lenghtSum);
        System.out.println(A.charAt(0) > B.charAt(0) ? "Yes" : "No");
        System.out.println(sbA.toString() + " " + sbB.toString());
    }
}
