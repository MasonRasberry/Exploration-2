import java.util.HashMap;

public class Hashing {
    public static int nearlyIdentical (int[] input) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int value : input) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int longest = 0;

        for (int value : map.keySet()) {
            if (map.containsKey(value + 1)) {
                longest = Math.max(longest, map.get(value) + map.get(value + 1));
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int [] input = {3,1,2,2,2,1,2};
        System.out.println(nearlyIdentical(input));
    }
}
