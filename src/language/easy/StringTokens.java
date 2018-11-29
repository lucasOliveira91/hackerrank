package language.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        int cont = 0;
        List<String> list = new ArrayList<>();
        for (String ss : Arrays.asList(s.split("[A-Za-z]+"))){
            cont++;
            list.add(ss);
        }

        System.out.println(cont);
        for (String ss : list){
            System.out.println(ss);
        }
        scan.close();
    }
}
