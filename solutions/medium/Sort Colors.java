// Title: Sort Colors
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-colors/

                mid++;
            }
            else if(nums[mid]==2){
                Swap(nums,mid,high);
            }
                high--;
        }
    }
            else if(nums[mid]==1){
    void Swap(int[] nums,int num1,int num2){
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}
