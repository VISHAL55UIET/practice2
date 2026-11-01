class Solution {

    public int minMoves(int[] nums) {
        int n = nums.length;

        long sum = 0;
        int minEl = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            minEl = Math.min(minEl, nums[i]);
        }

        return (int) (sum - (long) n * minEl);
    }

    // Main method for local testing
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3};
        System.out.println("Test Case 1: " + sol.minMoves(nums1));
        

        int[] nums2 = {1, 1, 1};
        System.out.println("Test Case 2: " + sol.minMoves(nums2));
        

        int[] nums3 = {5, 6, 8, 8};
        System.out.println("Test Case 3: " + sol.minMoves(nums3));
        

        int[] nums4 = {1, 1000000};
        System.out.println("Test Case 4: " + sol.minMoves(nums4));
        
    }
}