package hire.easy;

public class JumpingOnTheClouds {

    public static void main(String args[]) {
        int clouds[] = {0,0,1,0,0,1,0};

        int jumps = 0;
        for (int i = 0; i + 1 < clouds.length;) {
            if(i + 2 < clouds.length && clouds[i + 2] == 0) {
                jumps++;
                i = (i + 2);
            }else if(i + 1 < clouds.length && clouds[i + 1] == 0) {
                jumps++;
                i = (i + 1);
            }
        }

        System.out.println(jumps);
    }
}
