// Title: Rotate Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] rotated=new int[n];
        for(int i=0;i<n;i++){
            rotated[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=rotated[i];
        }
