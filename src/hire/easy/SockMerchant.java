package hire.easy;

/**
 * Created by loliveira on 28/02/19.
 *
 *  Use set to verify if number exists
 *  case exists so this number has its pair
 *  removed from list to next verification
 */
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SockMerchant {



    public static void main(String[] args) throws IOException {
        Integer ar[] = {10,20,20,10,20};

        Set set = new HashSet<>();

        int pairs = 0;
        for (int i = 0; i < ar.length; i++) {
            if(!set.contains(ar[i])) {
                set.add(ar[i]);
            }else {
                pairs ++;
                set.remove(ar[i]);
            }
        }

        System.out.print(pairs);

    }
}
