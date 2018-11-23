import java.util.Scanner;

/**
 * Java Datatypes
 * Range Primitives
 */
public class DataTypes {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                }

                if(x >= -32768 && x<= 32767) {
                    System.out.println("* short");
                }

                Double rangeInt = Math.pow(2, 31);
                if(x >= -rangeInt.intValue() -1 && x<= rangeInt.intValue()) {
                    System.out.println("* int");
                }

                Double rangeLong = Math.pow(2, 64);
                if(x >= -rangeLong.longValue() -1  && x<= rangeLong.longValue()) {
                    System.out.println("* long");
                }

            } catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
