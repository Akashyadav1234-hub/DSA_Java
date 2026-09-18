// Title: Missing Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/missing-number/

    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int ans=(n*(n+1)/2)-sum;
        return ans;
    }
