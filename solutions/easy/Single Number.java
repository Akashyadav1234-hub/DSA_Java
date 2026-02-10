// Title: Single Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int uniqnum=0;
        for(int ins:nums){
            uniqnum ^= ins;
        }
    }
        return uniqnum;
}
