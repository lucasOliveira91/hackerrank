package hire.easy;

public class RepeatedString {

    public static void main(String args[]) {
        String txt = "a";
        int repeatNumber = 100;

        String result = txt;
        int repeadDid = 0;
        for (int i = 0; i < repeatNumber; i++) {
            int numberSlotsFree = repeatNumber - result.length();

            if(numberSlotsFree < txt.length()) {
                String substring = txt.substring(0, numberSlotsFree);
                result += substring;
                repeadDid += substring.length();

            }else {
                result += txt;
                repeadDid += txt.length();
            }

        }

        int x = 0;
        for (int i = 0; i < result.toCharArray().length; i++) {
            if(new Character(result.toCharArray()[i]).toString().equals(txt)) {
                x++;
            }
        }

        if(x == result.length()) {
            repeadDid = result.length();
        }

         System.out.println(repeadDid);

    }
}
