package language.easy;

import java.util.Scanner;


/**
 * Java Loops II
 */
public class LoopsII {


    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


            int resulto = 0;
            for(int ii=0;ii < n; ii++) {
                Double aoQuadradoZero = Math.pow(2, 0);
                Double aoQuadrado = Math.pow(2, ii);

                if(ii == 0){
                    resulto = (a + aoQuadradoZero.intValue() * b);
                }
                else{
                    resulto = resulto + aoQuadrado.intValue() * b;
                }

                System.out.print(resulto + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
