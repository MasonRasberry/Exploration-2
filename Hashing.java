import java.util.HashMap;

public class Hashing {
    public static int nearlyIdentical (int[] input) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < input.length; i++) {
            map.put(input[i],0);
        }

        for (int j = 0; j < input.length; j++) {
            if (map.containsKey(j)) {
                map.put(input[j],map.get(j)+1);
            }
        }
        Integer longest = 0;

        for (int h = 0; h < map.size(); h++) {
            if (map.containsKey(h+1)) {
                longest = Math.max(longest, map.get(h) + map.get(h+1));
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int [] input = {3,1,2,2,2,1,2};
        System.out.println(nearlyIdentical(input));
    }
}
