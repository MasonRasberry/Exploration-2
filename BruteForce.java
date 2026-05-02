import java.lang.Math;

public class BruteForce {
    public static int nearlyIdentical (int[] input) {
        int longest = 0;
        for (int i = 0; i < input.length; i++) {
            int count = 0;
            boolean nextPresent = false;
            for (int j = 0; j < input.length; j++) {
                if(input[j] == input[i]) {
                    count++;
                } else if (input[j] + 1 == input[i]) {
                    count++;
                    nextPresent = true;
                }
            }
            if (nextPresent) {
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int [] input = {3,1,2,2,2,1,2};
        System.out.println(nearlyIdentical(input));
    }
}
