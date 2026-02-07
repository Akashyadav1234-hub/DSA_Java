// Title: Median of Two Sorted Arrays
            // Difficulty: Unknown
            // Language: Java
            // Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution{
    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int[] new_arr=new int[n];

        int i=0,j=0,k=0;
        
        while(i<=n1 && j<=n2){
            if(i==n1) {
                while(j<n2) new_arr[k++]=nums2[j++];
                break;
            } else if(j==n2){
                while(i<n1) new_arr[k++]=nums1[i++];
                break;
            }

