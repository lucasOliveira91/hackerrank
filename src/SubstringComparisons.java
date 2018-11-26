
public class SubstringComparisons {

    public static void main(String... args){
        System.out.println(getSmallestAndLargest("welcomeToJava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String smallest = "";
        String largest = "";

        int numberSplits = s.length() / k;

        java.util.SortedSet<String> result = new java.util.TreeSet<>();
        int stoped = 0;
        for (int i = 0; i <= s.length() - k; i++){
            result.add(s.substring(i, i + k));
        }

        smallest = result.first();
        largest = result.last();

        return smallest + "\n" + largest;
    }
}
