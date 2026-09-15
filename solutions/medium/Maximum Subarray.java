// Title: Maximum Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            res=Math.max(nums[i],res+nums[i]);
            total=Math.max(res,total);
        }
    }
        return total;
}
