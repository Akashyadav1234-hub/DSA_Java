// Title: Binary Search
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-search/

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
