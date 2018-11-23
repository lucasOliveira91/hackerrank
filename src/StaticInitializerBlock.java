import java.util.Scanner;

public class StaticInitializerBlock {

    private static final Scanner scanner = new Scanner(System.in);
    static int B;
    static int H;
    static boolean flag;
    static{
        B = scanner.nextInt();
        H = scanner.nextInt();

        if(B > 0 && H > 0) {
            flag = true;
        }else {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
