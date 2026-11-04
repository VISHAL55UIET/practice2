import java.util.*;

class Solution {
    public long minimumCost(int[] nums) {
        Arrays.sort(nums); //sort the array
        long lower=nums[nums.length/2]; //median of the array
        long upper=nums[nums.length/2];
        while(!isPal(lower)) lower--;   //find the first palindrome smaller than median
        while(!isPal(upper)) upper++;   //find the fisrt palindrome larger than median
        long diff1=0;
        long diff2=0;
        for(int c:nums) diff1+=Math.abs(c-lower); //compute the cost with lower
        for(int c:nums) diff2+=Math.abs(c-upper); //compute the cost with upper
        return Math.min(diff1,diff2); //return the minimum
    }

    public boolean isPal(long num) {
        if(num<0) return false;
        long original = num;
        long reversed = 0;
        while (num > 0) {
            long digit=num%10;
            reversed=(reversed*10)+digit;
            num/=10;
        }
        return original==reversed;
    }
}