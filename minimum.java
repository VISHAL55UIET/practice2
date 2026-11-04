import java.util.*;

class Solution {
    public long minimumCost(int[] nums) {
        Arrays.sort(nums);
        long lower = nums[nums.length / 2];
        long upper = nums[nums.length / 2];
        while (!isPal(lower)) lower--;
        while (!isPal(upper)) upper++;
        long diff1 = 0;
        long diff2 = 0;
        for (int c : nums) diff1 += Math.abs(c - lower);
        for (int c : nums) diff2 += Math.abs(c - upper);
        return Math.min(diff1, diff2);
    }
    public boolean isPal(long num) {
        if (num < 0) return false;
        long original = num;
        long reversed = 0;
        while (num > 0) {
            long digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }
        return original == reversed;
    }
}

public class minimum{
    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(sol.minimumCost(nums1)); // 6
        int[] nums2 = {10, 12, 13, 14, 15};
        System.out.println(sol.minimumCost(nums2)); // 11
        int[] nums3 = {1, 2, 3, 4, 5, 6};
        System.out.println(sol.minimumCost(nums3)); // 6
        int[] nums4 = {100, 200, 300};
        System.out.println(sol.minimumCost(nums4)); //
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Minimum Cost: " + sol.minimumCost(nums));
    }
}