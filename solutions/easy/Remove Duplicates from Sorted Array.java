// Title: Remove Duplicates from Sorted Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

        for(int i=1;i<nums.length;i++){
            if(nums[c]!=nums[i]){
                nums[++c]=nums[i];
            }
        }
        return c+1;
    }
}
        int c=0;
    public int removeDuplicates(int[] nums){
class Solution{
