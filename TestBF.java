public class TestBF {
    public static void main(String[] args) {
        int[][] tests = {
            {3, 1, 2, 2, 2, 1, 2},
            {1, 1, 1, 1},
            {1, 2, 3, 4},
            {-2, -1, -1, 0, 4},
            {}
        };

        for (int[] test : tests) {
            long start = System.nanoTime();
            System.out.println(BruteForce.nearlyIdentical(test));
            long end = System.nanoTime();
            long duration = end - start;
            System.out.println("The current input took " + duration + " nanoseconds.");
        }
    }
}
