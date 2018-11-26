import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder reverse = new StringBuilder(A).reverse();
        System.out.println(A.equals(reverse.toString()) ? "Yes" : "No");
    }
}
