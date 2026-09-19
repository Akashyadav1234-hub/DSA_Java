// Title: Find the Duplicate Number
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-duplicate-number/

        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
