package hire.easy;

/**
 *  In this problem is so simple
 *  Just count when him up from under sea level
 *  When is U count up 1
 *  where is D count down 1
 *  where this interation is U and the current  level is 0 it means that just up from the valey.
 */
public class CountingValleys {

    public static void main(String args[]) {
        String stringPath = "DDUUDDUDUUUD";
        char hikePath[] = stringPath.toCharArray();

        int currentStep = 0;
        int valleys = 0;
        for (int i = 0; i < hikePath.length; i++) {
            if(hikePath[i] == 'U') {
                currentStep++;
            }

            if(hikePath[i] == 'D') {
                currentStep--;
            }

            if(currentStep == 0 && hikePath[i] == 'U') {
                valleys++;
            }
        }

        System.out.println(valleys);
    }
}
