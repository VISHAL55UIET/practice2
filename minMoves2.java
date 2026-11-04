import java.util.*;

class Solution{
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        long moves = 0;

        for (int num : nums) {
            moves += Math.abs(num - median);
        }

        return (int) moves;
    }
}

public class minMoves2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution sol = new Solution();

        // Test Case 1
        int[] nums1 = {1, 2, 3};
        System.out.println(sol.minMoves2(nums1)); // 2

        // Test Case 2
        int[] nums2 = {1, 10, 2, 9};
        System.out.println(sol.minMoves2(nums2)); // 16

        // Test Case 3
        int[] nums3 = {1, 0, 0, 8, 6};
        System.out.println(sol.minMoves2(nums3)); // 14

        // Custom Input
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Minimum Moves: " + sol.minMoves2(nums));
    }
}