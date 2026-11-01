import java.util.*;

public class Main {

    public static double pourWaterBetweenBucketsToMakeWaterLevelsEqual(List<Integer> buckets, int loss) {
        double low = 0;
        double high = Collections.max(buckets);
        while (high - low > 1e-6) {
            double mid = (low + high) / 2;
            double available = 0;
            double needed = 0;
            for (int x : buckets) {
                if (x > mid) {
                    available += x - mid;
                } else {
                    needed += (mid - x) * 100.0 / (100 - loss);
                }
            }
            if (available >= needed) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        // Test Case 1
        System.out.printf("%.4f%n",
                pourWaterBetweenBucketsToMakeWaterLevelsEqual(Arrays.asList(10, 5, 15), 20));
        // Test Case 2
        System.out.printf("%.4f%n",
                pourWaterBetweenBucketsToMakeWaterLevelsEqual(Arrays.asList(10, 10, 10), 20));
        // Test Case 3
        System.out.printf("%.4f%n",
                pourWaterBetweenBucketsToMakeWaterLevelsEqual(Arrays.asList(5, 10), 0));

        // Test Case 4
        System.out.printf("%.4f%n",
                pourWaterBetweenBucketsToMakeWaterLevelsEqual(Arrays.asList(1, 2, 3, 4, 5), 10));

        // Test Case 5
        System.out.printf("%.4f%n",
                pourWaterBetweenBucketsToMakeWaterLevelsEqual(Arrays.asList(100, 50, 25), 50));
    }
}